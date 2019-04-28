package com.xuming.springcloud.serviceproducer8002.controller;
import com.xuming.springcloud.serviceproducer8002.service.TestService;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by yuanqi on 2019/4/13.
 */
@RestController
@RequestMapping("producer8002")
public class EurekaClientController {


    @Autowired
    private TestService testService;

    @RequestMapping(value = "queryServiceInfo")
    public String queryServiceInfo(){
        return testService.queryInfo();
    }


}
