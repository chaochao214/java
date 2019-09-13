package com.twc.factory;

import com.twc.service.AccountService;
import com.twc.service.impl.AccountServiceImpl;

/**
 * @Author: twc
 * @Date 2019/6/1 9:34
 * 模拟一个工厂类，该类可能也是存在于jar中过程中的
 **/
public class InstanceFactory {
    //非静态方法创建工厂类
    public AccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
