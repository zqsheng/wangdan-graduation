package com.wangdan.common.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private Integer id;
    private String loginName;
    private String name;
    private String password;
    // 注册时间
    private Timestamp enrollTime;
    // 最后登录时间
    private Timestamp lastestLoginTime;
}
