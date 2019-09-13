package com.twc.service.impl;

import com.twc.dao.AccountDao;
import com.twc.service.AccountService;

/**
 * @Author: twc
 * @Date 2019/6/1 10:55
 **/
public class AccountServiceImpl3 implements AccountService {
    AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void saveAccount() {

        System.out.println("accountService3中的save方法被执行");
    }
}
