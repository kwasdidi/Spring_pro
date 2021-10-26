package com.kwas.dao;

import com.kwas.pojo.User;
import com.kwas.pojo.UserRole;

import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/21 22:44
 * @Version 1.0
 */
public interface UserDao {
    List<UserRole> findAll();

    int insertUser(User user);
}
