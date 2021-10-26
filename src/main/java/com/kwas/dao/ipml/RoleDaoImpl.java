package com.kwas.dao.ipml;

import com.kwas.dao.RoleDao;
import com.kwas.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/23 12:10
 * @Version 1.0
 */
@Repository
public class RoleDaoImpl implements RoleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Role> findAll() {
        String sql="select * from sys_role";
        List<Role> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Role>(Role.class));
        return list;
    }

    @Override
    public int delByRoleid(int Roleid) {
        String sql="delete from sys_role where id =? " ;
        int flag = jdbcTemplate.update(sql, Roleid);
        return flag;
    }
}
