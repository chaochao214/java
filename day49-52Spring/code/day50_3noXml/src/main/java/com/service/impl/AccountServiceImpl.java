package com.service.impl;

import com.dao.AccountDao;
import com.domin.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/26 20:37
 **/

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }
}
