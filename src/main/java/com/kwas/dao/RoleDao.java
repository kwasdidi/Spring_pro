package com.kwas.dao;

import com.kwas.pojo.Role;

import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/23 12:09
 * @Version 1.0
 */
public interface RoleDao {
    List<Role> findAll();

    int delByRoleid(int Roleid);
}
