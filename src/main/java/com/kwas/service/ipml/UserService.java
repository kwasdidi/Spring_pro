package com.kwas.service.ipml;

import com.kwas.pojo.User;
import com.kwas.pojo.UserRole;

import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/21 23:05
 * @Version 1.0
 */
public interface UserService {
    
    List<UserRole>  findall();

    int insertUser(User user);
    
}
