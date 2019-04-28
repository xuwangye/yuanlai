package com.xuming.springcloud.yuanlaiapi.fallback;

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
public class UserFallbackHandle implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public List<User> findUserList() {
                List<User> list = new ArrayList<>();
                User user = new User();
                user.setId(-1);
                user.setName("触发UserFallbackHandle熔断器....");
                list.add(user);
                return list;
            }
        };
    }
}
