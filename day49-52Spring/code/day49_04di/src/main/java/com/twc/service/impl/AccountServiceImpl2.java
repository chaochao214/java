package com.twc.service.impl;

import com.twc.service.AccountService;

import java.util.Date;

/**
 * @Author: twc
 * @Date 2019/6/1 10:40
 **/
public class AccountServiceImpl2 implements AccountService {
    private String name;
    private Integer age;
    private Date birthday;

    @Override
    public void saveAccount() {
        System.out.println("serviceIml中的saveAccount方法" + name + "-" + "age" + "-" + birthday);

    }
    //这个 spring的符号是什么含义 p还B?
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
