package com.xuming.springcloud.yuanlaiapi.fallback;

import com.xuming.springcloud.yuanlaiapi.service.TestService;
import com.xuming.springcloud.yuanlaiapi.service.UserService;
import com.xuming.springcloud.yuanlaientity.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 熔断器机制
 * Created by yuanqi on 2019/4/16.
 */
@Component
public class TestFallbackHandle implements FallbackFactory<TestService> {

    @Override
    public TestService create(Throwable throwable) {
        return new TestService() {
            @Override
            public String queryInfo() {
                return "触发TestFallbackHandle熔断器....";
            }
        };
    }
}
