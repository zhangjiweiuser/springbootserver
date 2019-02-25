package com.zhang.boot2.dao;

import com.zhang.boot2.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    int insert(User user);

    User getUser(@Param("id") int id);
}
