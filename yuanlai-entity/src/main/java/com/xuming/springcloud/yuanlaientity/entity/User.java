package com.xuming.springcloud.yuanlaientity.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

/**
 * Created by yuanqi on 2019/4/13.
 */

@Data
@Accessors(chain = true)
public class User {

    /**
     * id
     */
    private int id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别：0女  1男
     */
    private int sex;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

}
