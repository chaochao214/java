package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: twc
 * @Date 2019/8/8 11:35
 **/
@Controller
public class QuickStartController {
    @RequestMapping("/quick")
    @ResponseBody
    public  String quick(){
        return  "springboot 访问成功!";
    }

}
