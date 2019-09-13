package com.twc.service.impl;

import com.twc.dao.AccountDao;
import com.twc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2019/5/25 20:29
 **/
public class AccountServiceImpl implements AccountService {
    public AccountServiceImpl() {
        System.out.println("accounServiceImpl的空构造器");
    }
    //new Dao

    //这里为什么不能通过spring直接获取
  /*  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    AccountDao accountDao = (AccountDao) ac.getBean("AccountDao");*/
    @Autowired
    AccountDao accountDao;

    //注入Di


    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void saveAccount() {
        System.out.println("accountServiceImpl中的save方法被执行");
        accountDao.save();
    }
}
