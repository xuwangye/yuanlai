package com.xuming.springcloud.yuanlaidao.mapper;

import com.xuming.springcloud.yuanlaientity.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yuanqi on 2019/4/13.
 */
@Repository
public interface UserMapper {

    /**
     * 查询所有用户列表
     * @return
     */
    List<User> findUserList(String id);
}
