package com.bee.service.impl;


import com.bee.dao.UserDao;
import com.bee.entity.User;
import com.bee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Anni on 2016/10/25.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public List<User> getUsers() {
        return userDao.getUsers();
    }
}