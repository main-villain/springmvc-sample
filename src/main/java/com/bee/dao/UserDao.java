package com.bee.dao;

import com.bee.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 项目名：springmvc-sample
 * 作者：汤竞祥
 * 日期：2016/11/11 19:33
 */
@Repository
public interface UserDao {

    public List<User> getUsers();

}
