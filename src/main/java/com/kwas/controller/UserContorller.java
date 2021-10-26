package com.kwas.controller;

/**
 * @Author LZX
 * @Date 2021/10/21 23:07
 * @Version 1.0
 */

import com.kwas.pojo.User;
import com.kwas.pojo.UserRole;
import com.kwas.service.ipml.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserContorller {
    @Autowired
    private UserService userService;
    @Autowired
    private User user;

    @RequestMapping("/userlist")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<UserRole> userlist = userService.findall();
        modelAndView.addObject("userlist",userlist);

        modelAndView.setViewName("/pages/user-list.jsp");
          return modelAndView;
    }
@RequestMapping("/insert")
    public String insertUser( String username, String password, String email, String phoneNum){
      user.setId(4L);
      user.setUsername(username);
      user.setPassword(password);
      user.setEmail(email);
      user.setPhoneNum(phoneNum);
    int i = userService.insertUser(user);


    return  "/user/userlist";


    }
}
