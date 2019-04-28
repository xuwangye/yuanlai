package com.xuming.springcloud.serviceconsumer9001.controller;

//import com.xuming.springcloud.serviceconsumer9001.service.UserService;

import com.xuming.springcloud.serviceconsumer9001.service.TestService;
import com.xuming.springcloud.yuanlaientity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/13.
 */
@RestController
@RequestMapping("comsumer-9001")
public class TestConsumerController {

    @Autowired
    private TestService testService;

    @RequestMapping("queryServiceInfo")
    public String findUserList(){
        String msg = testService.queryInfo();
        return msg;
    }





    /**

     //private static final String REST_URL_PREFIX = "http://localhost:8001";

     //使用@LoadBalanced，这时候需要用服务名来访问方法。
     private static final String REST_URL_PREFIX = "http://EUREKA-SERVER-8001";

     @Autowired
     private RestTemplate restTemplate;

     @RequestMapping("findUserList")
     public List<User> findUserList(){
     List<User> users = restTemplate.getForObject(REST_URL_PREFIX+"/producer8001/queryUserList",List.class);
     return users;
     }

     **/
}
