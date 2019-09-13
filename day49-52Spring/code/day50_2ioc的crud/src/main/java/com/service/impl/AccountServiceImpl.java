package com.service.impl;

import com.dao.AccountDao;
import com.domin.Account;
import com.service.AccountService;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/26 20:37
 **/
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }
}
