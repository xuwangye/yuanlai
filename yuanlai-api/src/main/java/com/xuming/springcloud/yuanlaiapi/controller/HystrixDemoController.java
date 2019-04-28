package com.xuming.springcloud.yuanlaiapi.controller;

import com.xuming.springcloud.yuanlaiapi.service.UserService;
import com.xuming.springcloud.yuanlaientity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/17.
 */
@RestController()
@RequestMapping("yuanlai-api")
public class HystrixDemoController {
    @Autowired
    private UserService userService;

    @RequestMapping("findUserList")
    public List<User> findUserList(){
        List<User> users = userService.findUserList();
        return users;
    }
}
