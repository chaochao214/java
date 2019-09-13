package com.twc.controller;

import com.twc.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: twc
 * @Date 2019/6/3 9:29
 **/
@Controller
@RequestMapping(path = "/user")
public class UserController {
    @RequestMapping(path = "/textException")
    public String testException() throws SysException {
        System.out.println("执行了exception的方法");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
             throw  new SysException("服务器繁忙，请稍后再试...");
        }
        return "success";
    }
}
