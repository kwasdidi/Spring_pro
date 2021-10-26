package com.kwas.dao.ipml;

import com.kwas.dao.UserDao;
import com.kwas.pojo.User;
import com.kwas.pojo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author LZX
 * @Date 2021/10/21 22:49
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public List<UserRole>findAll() {
        String sql="select a.id,b.username,b.email,b.phoneNum,a.roleDesc from sys_role a left join sys_user b on a.id =b.id " ;
//        UserRole userRole = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<UserRole>(UserRole.class));
        List<UserRole> userRoles = jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserRole>(UserRole.class));
        System.out.println(userRoles);
        return userRoles;
    }

    @Override
    public int insertUser(User user) {
        String sql ="insert into sys_user  values (?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, user.getId(), user.getUsername(), user.getEmail(), user.getPassword(), user.getPhoneNum());
        return update;
    }
}
