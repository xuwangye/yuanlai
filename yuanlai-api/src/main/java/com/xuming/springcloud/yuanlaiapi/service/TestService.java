package com.xuming.springcloud.yuanlaiapi.service;

import com.xuming.springcloud.yuanlaiapi.fallback.TestFallbackHandle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuanqi on 2019/4/13.
 */
@FeignClient(name = "EUREKA-SERVER-8002",fallbackFactory = TestFallbackHandle.class)
public interface TestService {

    @RequestMapping(value = "/producer8002/queryServiceInfo")
    String queryInfo();
}
