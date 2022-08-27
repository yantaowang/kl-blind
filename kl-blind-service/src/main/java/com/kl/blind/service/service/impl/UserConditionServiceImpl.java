package com.kl.blind.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kl.blind.service.data.entity.UserConditionEntity;
import com.kl.blind.service.data.mapper.UserConditionMapper;
import com.kl.blind.service.service.UserConditionService;
import org.springframework.stereotype.Service;

@Service
public class UserConditionServiceImpl extends ServiceImpl<UserConditionMapper, UserConditionEntity> implements UserConditionService {
}
