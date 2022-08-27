package com.kl.blind.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kl.blind.service.data.entity.ActivityEntity;
import com.kl.blind.service.data.mapper.ActivityMapper;
import com.kl.blind.service.service.ActivityService;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, ActivityEntity> implements ActivityService {
}
