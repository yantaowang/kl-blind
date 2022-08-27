package com.kl.blind.controller;

import com.kl.blind.service.dto.UserCreateDTO;
import com.kl.blind.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/register", method = {RequestMethod.POST, RequestMethod.GET})
    public void register(@RequestBody UserCreateDTO userCreateDTO) {
        userService.register(userCreateDTO);
    }
}
