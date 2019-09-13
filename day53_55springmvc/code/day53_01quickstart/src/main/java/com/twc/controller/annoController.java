package com.twc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

/**
 * @Author: twc
 * @Date 2019/5/31 21:35
 **/
@Controller
@RequestMapping(path = "/anno")
public class annoController {
    @RequestMapping(path = "/testRequestParam")
    public String testRequestParam(@RequestParam(value="name") String username, @RequestParam(value = "age", required = true) Integer age) {
        System.out.println("anno/testRequestParam");
        System.out.println(username);
        System.out.println(age);

        return "success";
    }

    @RequestMapping(path = "/testRequestBody")
    public String testRequestBody(@RequestBody(required = true) String body) {
        System.out.println("hello spring,测试requestbody");
        System.out.println(body);
        return "success";

}

    //    rest风格的测试
    @RequestMapping(path = "/testPathVariable/{uid}")
    public String testPathVariable(@PathVariable(value = "uid") Integer id) {
        System.out.println("springmvc的问题");
        System.out.println(id);
        return "success";

    }

}
