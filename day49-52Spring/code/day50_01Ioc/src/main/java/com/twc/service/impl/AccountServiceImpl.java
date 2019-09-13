package com.twc.service.impl;

import com.twc.dao.AccountDao;
import com.twc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: twc
 * @Date 2019/5/26 19:48
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier("accountDao2")
    private AccountDao accountDao = null;

    public AccountServiceImpl() {
        System.out.println("accountServiceimpl的构造方法");

    }

    @PostConstruct
    public void init() {
        System.out.println("初始化方法被执行了");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁方法被执行了");
    }


    @Override
    public void saveAccount() {
        accountDao.saveAccount();
        System.out.println("serviceImpl中的save方法被执行");

    }
}
