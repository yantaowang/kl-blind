package com.kl.blind.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kl.blind.service.data.entity.UserFollowEntity;
import com.kl.blind.service.data.mapper.UserFollowMapper;
import com.kl.blind.service.service.UserFollowService;
import org.springframework.stereotype.Service;

@Service
public class UserFollowServiceImpl extends ServiceImpl<UserFollowMapper, UserFollowEntity> implements UserFollowService {
}
