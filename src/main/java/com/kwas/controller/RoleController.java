package com.kwas.controller;

import com.kwas.pojo.Role;
import com.kwas.service.ipml.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author LZX
 * @Date 2021/10/23 12:16
 * @Version 1.0
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/rolelist")
    public ModelAndView getRole(ModelAndView md){
        List<Role> rolelist = roleService.findAll();
        md.setViewName("/pages/role-list.jsp");
        md.addObject("rolelist",rolelist);


        return md;
    }
    @RequestMapping("/del_role")
    public ModelAndView delRole(@RequestParam int Roleid, ModelAndView md) throws IOException, ServletException {
        String msg="";

        System.out.println(Roleid);
        int i = roleService.delByRoleid(Roleid);
        if(i==1){
            msg="success";
        }else {
            msg="fail";
        }
       md.addObject("msg",msg);

       md.setViewName("/role/rolelist");

        return md;
    }
}
