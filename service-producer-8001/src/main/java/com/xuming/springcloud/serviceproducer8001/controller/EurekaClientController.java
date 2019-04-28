package com.xuming.springcloud.serviceproducer8001.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xuming.springcloud.yuanlaientity.entity.User;
import com.xuming.springcloud.serviceproducer8001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanqi on 2019/4/13.
 */
@RestController // value 是 springbean 的名字
@RequestMapping(value = "producer8001")
public class EurekaClientController {

    @Autowired
    private UserService userService;

    private static int i = 1;

    @RequestMapping(value = "queryUserList")
    public List<User> queryServiceInfo(String id){

//        try {
//
//            Thread.sleep(1000*60*10);   //休眠十分钟
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        int i = 10/0;

        System.out.println("第"+(i++)+"次请求！");
        List<User> list = userService.findUserList(id);
        return list;
    }


}
