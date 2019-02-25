package com.zhang.boot2.service;

import com.zhang.boot2.dao.UserDao;
import com.zhang.boot2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public int addUser(User user) {
        return userDao.insert(user);
    }

    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
