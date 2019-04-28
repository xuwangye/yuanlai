package com.xuming.springcloud.serviceproducer8001.service.impl;

import com.xuming.springcloud.yuanlaientity.entity.User;
import com.xuming.springcloud.yuanlaidao.mapper.UserMapper;
import com.xuming.springcloud.serviceproducer8001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findUserList(String id) {
        return userMapper.findUserList(id);
    }
}
