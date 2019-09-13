package com.twc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: twc
 * @Date 2019/5/31 20:23
 **/
@Controller
@RequestMapping(path = "/user")
public class HelloController {
    //请求参数
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("hello springMvc");
        return "success";

    }
    //请求参数
    @RequestMapping(path = "testRequestMapping")
    public String testRequsetMapping(){
        System.out.println("测试请求参数的问题");
        return  "success";
    }

}
