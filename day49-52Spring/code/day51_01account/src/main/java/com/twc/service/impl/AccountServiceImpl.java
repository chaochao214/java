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
        try {
            txManager.beginTransaction();

            List<Account> account = accountDao.findAllAccount();
            txManager.commit();
            return account;
        } catch (Exception e) {
            txManager.rollback();
            throw new RuntimeException(e);
        } finally {
            txManager.release();
        }
    }

    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transer");
        //开启事务的问题
        try {
            txManager.beginTransaction();
            Account source = accountDao.findAccountByname(sourceName);
            //根据名称查询转入账户
            Account target = accountDao.findAccountByname(targetName);
            //转出账号减前
            source.setMoney(source.getMoney() - money);
            target.setMoney(target.getMoney() + money);
            //更新转出账号
            accountDao.updateAccout(source);
            //测试事务回滚的操作
//            事务出错回滚不会倒置数据库的错误
            // int i = 10 / 0;
            accountDao.updateAccout(target);
            txManager.commit();
        } catch (Exception e) {
            txManager.rollback();
            e.printStackTrace();
        } finally {
            txManager.release();
        }

    }


}
