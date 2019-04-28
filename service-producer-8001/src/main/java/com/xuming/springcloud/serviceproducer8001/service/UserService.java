package com.xuming.springcloud.serviceproducer8001.service;

import com.xuming.springcloud.yuanlaientity.entity.User;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/13.
 */
public interface UserService {

    List<User> findUserList(String id);
}
