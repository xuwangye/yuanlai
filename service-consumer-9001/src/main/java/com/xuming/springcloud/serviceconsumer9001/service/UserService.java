package com.xuming.springcloud.serviceconsumer9001.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xuming.springcloud.serviceconsumer9001.fallback.UserFallbackHandle;
import com.xuming.springcloud.yuanlaientity.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import rx.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by yuanqi on 2019/4/13.
 */
@FeignClient(name = "EUREKA-SERVER-8001",fallbackFactory = UserFallbackHandle.class)
public interface UserService {

    @RequestMapping(value = "/producer8001/queryUserList")
//    @HystrixCommand(groupKey = "UserService", commandKey = "commandKey-findUserList",
//            commandProperties = {
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "400"),//指定多久超时，单位毫秒。超时进fallback
//                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//判断熔断的最少请求数，默认是10；只有在一个统计窗口内处理的请求数量达到这个阈值，才会进行熔断与否的判断
//                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "10"),//判断熔断的阈值，默认值50，表示在一个统计窗口内有50%的请求处理失败，会触发熔断
//            },
//            threadPoolProperties = {
//                    @HystrixProperty(name = "coreSize", value = "30"),
//                    @HystrixProperty(name = "maxQueueSize", value = "101"),
//                    @HystrixProperty(name = "keepAliveTimeMinutes", value = "2"),
//                    @HystrixProperty(name = "queueSizeRejectionThreshold", value = "15"),
//                    @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "12"),
//                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "1440")
//            }
//    )
//    @HystrixCommand(groupKey = "UserService",commandKey = "commandKey-findUserList")
    List<User> findUserList();

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "bb", "cc", "ddd");

        TreeMap<Integer, List<String>> result = strings.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, toList()));

        System.out.println(result); // {1=[a], 2=[bb, cc], 3=[ddd]}
    }

}
