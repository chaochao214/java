package com.twc.controller;

import com.twc.domain.User;
import com.twc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: twc
 * @Date 2019/6/4 9:28
 **/
@Controller
//value和path属性的区别问题
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save")
    public String save(User user) {
        int account = userService.saveUser(user);
        if (account > 0) {
            // 新增成功，返回登录页面
            return "redirect:/login.html";
        } else {
            //新增失败
            return "redirect:/register.html";
        }

    }
}
