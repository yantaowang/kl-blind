package com.kl.blind.service.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kl.blind.service.data.entity.UserEntity;
import com.kl.blind.service.data.entity.UserImageEntity;
import com.kl.blind.service.data.mapper.UserImageMapper;
import com.kl.blind.service.data.mapper.UserMapper;
import com.kl.blind.service.dto.UserCreateDTO;
import com.kl.blind.service.service.UserService;
import com.kl.blind.service.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
    private UserImageMapper userImageMapper;

    @Override
    public void register(UserCreateDTO userCreateDTO) {
        UserEntity userEntity = BeanUtil.copyProperties(userCreateDTO, UserEntity.class);
        if (userCreateDTO.getId() != null) {
            save(userEntity);
            saveImg(userCreateDTO.getUrlList(), userEntity.getId());
        } else {
            updateById(userEntity);
            userImageMapper.delete(new LambdaQueryWrapper<UserImageEntity>().eq(UserImageEntity::getUserId, userCreateDTO.getId()));
            saveImg(userCreateDTO.getUrlList(), userEntity.getId());
        }
    }

    @Override
    public UserInfoVO getUserInfo(Long userId) {
        Assert.notNull(userId, "参数错误");
        UserEntity userEntity = getById(userId);
        UserInfoVO userInfoVO = BeanUtil.copyProperties(userEntity, UserInfoVO.class);
        if (userInfoVO == null) {
            List<UserImageEntity> userImageEntities = userImageMapper.selectList(new LambdaQueryWrapper<UserImageEntity>().eq(UserImageEntity::getUserId, userId));
            if(!CollectionUtils.isEmpty(userImageEntities)) {
                userInfoVO.setUrlList(userImageEntities.stream().map(item -> item.getImageUrl()).collect(Collectors.toList()));
            }
        }
        return userInfoVO;
    }

    private void saveImg(List<String> imageList, Long userId) {
        imageList.forEach(item ->{
            UserImageEntity userImageEntity = new UserImageEntity();
            userImageEntity.setUserId(userId);
            userImageEntity.setImageUrl(item);
            userImageEntity.setCreateTime(LocalDateTime.now());
            userImageEntity.setUpdateTime(LocalDateTime.now());
        });
    }
}
