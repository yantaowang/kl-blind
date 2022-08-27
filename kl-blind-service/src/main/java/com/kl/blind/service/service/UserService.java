package com.kl.blind.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kl.blind.service.dto.UserCreateDTO;
import com.kl.blind.service.data.entity.UserEntity;
import com.kl.blind.service.vo.UserInfoVO;

public interface UserService extends IService<UserEntity> {

    void register(UserCreateDTO userCreateDTO);

    UserInfoVO getUserInfo(Long userId);

}
