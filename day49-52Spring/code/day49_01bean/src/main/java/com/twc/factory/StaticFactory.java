package com.twc.factory;

import com.twc.service.AccountService;
import com.twc.service.impl.AccountServiceImpl;

/**
 * @Author: twc
 * @Date 2019/5/25 20:14
 **/
public class StaticFactory {
    //创建service(静态方法）
    public static AccountService getAccountService() {

        return new AccountServiceImpl();
    }
}
