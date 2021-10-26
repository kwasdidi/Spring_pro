package com.kwas.service;

import com.kwas.dao.UserDao;
import com.kwas.pojo.User;
import com.kwas.pojo.UserRole;
import com.kwas.service.ipml.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/21 23:04
 * @Version 1.0
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public List<UserRole> findall() {
        List<UserRole> userlist = userDao.findAll();
        return userlist;
    }

    @Override
    public int insertUser(User user) {
        int i = userDao.insertUser(user);
        return i;
    }


}
