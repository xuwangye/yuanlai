package com.xuming.springcloud.yuanlaiapi.service;

import com.xuming.springcloud.yuanlaiapi.fallback.UserFallbackHandle;
import com.xuming.springcloud.yuanlaientity.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/13.
 */
@FeignClient(name = "EUREKA-SERVER-8001",fallbackFactory = UserFallbackHandle.class)
public interface UserService {

    @RequestMapping(value = "/producer8001/queryUserList")
    List<User> findUserList();
}
