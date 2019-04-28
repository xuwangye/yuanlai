package com.xuming.springcloud.serviceproducer8002.service.impl;


import com.xuming.springcloud.serviceproducer8002.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/13.
 */
@Service
public class TestServiceServiceImpl implements TestService {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public String queryInfo() {
        String description = discoveryClient.description();

        System.out.println(description);

//        int i = 10/0; //为了触发熔断器

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "你好，我是8002";
    }
}
