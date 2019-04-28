package com.xuming.springcloud.yuanlaidao.controller;

import com.xuming.springcloud.yuanlaientity.entity.User;
import com.xuming.springcloud.yuanlaidao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/15.
 */

@RestController
@RequestMapping("daotest")
public class Daocontroller {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "findlist")
    public  List<User> TestDao(){
        System.out.println("开始执行sql...");

        List<User> list = userMapper.findUserList(null);

        System.out.println("运行结束");


        User user = new User();
        user.setName("s").setId(9999);

        return list;
    }


}
