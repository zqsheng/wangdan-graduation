package com.wangdan.rs.mapper;

import com.wangdan.common.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    int saveUser(User user);

    int updateStatusById(int id,int status);

    User getUserById(int id);

    User getUserByLoginName(String name);

}
