package com.twc.controller;

import com.twc.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: twc
 * @Date 2019/5/31 20:51
 **/
@Controller
@RequestMapping(path = "/param")
public class ParamController {
    @RequestMapping(path = "/testParam")
    public String testParam(String username, Integer age) {
        System.out.println(" param的测试" + username + "--" + age);
        return "success";
    }


    // 这里的封装报错了
    @RequestMapping(path = "/saveAccount")
    public String testParm(Account account) {

        System.out.println(account);
        return "success";
    }
}

