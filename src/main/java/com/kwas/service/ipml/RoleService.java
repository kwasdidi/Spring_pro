package com.kwas.service.ipml;

import com.kwas.pojo.Role;

import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/23 12:13
 * @Version 1.0
 */
public interface RoleService {
    List<Role> findAll();

    int delByRoleid(int Roleid);
}
