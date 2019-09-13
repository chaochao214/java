package com.twc.service.impl;

import com.twc.dao.AccountDao;
import com.twc.domain.Account;
import com.twc.service.AccountService;
import com.twc.utils.TransactionManager;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/29 19:49
 **/
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private TransactionManager txManager;

    public void setTxManager(TransactionManager txManager) {
        this.txManager = txManager;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer....");
        //2.1根据名称查询转出账户
        Account source = accountDao.findAccountByname(sourceName);
        //2.2根据名称查询转入账户
        Account target = accountDao.findAccountByname(targetName);
        //2.3转出账户减钱
        source.setMoney(source.getMoney() - money);
        //2.4转入账户加钱
        target.setMoney(target.getMoney() + money);
        //2.5更新转出账户
        accountDao.updateAccout(source);

        //int i = 1 / 0;

        //2.6更新转入账户
         accountDao.updateAccout(source );

    }


}
