package com.twc.service.impl;

import com.twc.service.AccountService;

/**
 * @Author: twc
 * @Date 2019/5/25 20:10
 **/
public class AccountServiceImpl implements AccountService {

    // 默认午餐构

    public AccountServiceImpl() {


        System.out.println("对象被创建了.");
    }

    public AccountServiceImpl(String s) {
        System.out.println("这是一有参数的 构造方法");
    }

    public void init() {
        System.out.println("对象呗初始化");
    }

    public void destroy() {
        System.out.println("对象被销毁");
    }


    @Override
    public void saveAccount() {
        System.out.println("执行serviceImpl中的save方法");
    }
}
