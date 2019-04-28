package com.xuming.springcloud.serviceconsumer9001.fallback;

import com.xuming.springcloud.serviceconsumer9001.service.TestService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

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
