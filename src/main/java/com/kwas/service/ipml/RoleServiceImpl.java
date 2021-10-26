package com.kwas.service.ipml;

import com.kwas.dao.RoleDao;
import com.kwas.pojo.Role;
import com.kwas.pojo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/23 12:13
 * @Version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> findAll() {
        List<Role> rolelist = roleDao.findAll();
        return rolelist;
    }

    @Override
    public int delByRoleid(int Roleid) {

        int i = roleDao.delByRoleid(Roleid);
        return i;
    }
}
