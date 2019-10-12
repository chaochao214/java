package com.itheima.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: twc
 * @Date 2019/8/9 10:16
 **/
@RestController
@RequestMapping("/test")
public class QuickStartController {
    private String  name;
    private Integer age;
    @RequestMapping("/quick")
    @ResponseBody
    public  String  quick(){
        return  "springboot 访问成功";

}
    }
