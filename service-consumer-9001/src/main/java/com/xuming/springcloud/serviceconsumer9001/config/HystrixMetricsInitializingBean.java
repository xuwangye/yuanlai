package com.xuming.springcloud.serviceconsumer9001.config;

import com.netflix.hystrix.strategy.HystrixPlugins;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by yuanqi on 2019/4/25.
 */
@Slf4j
public class HystrixMetricsInitializingBean {

    public void init() throws Exception {
        log.info("HystrixMetrics starting...");
//        HystrixPlugins.getInstance().registerEventNotifier(CustomEventNotifier.getInstance());
//        HystrixPlugins.getInstance().registerMetricsPublisher(HystrixServoMetricsPublisher.getInstance());
    }

}
