package com.twc.service.impl;

import com.twc.Factory.BeanFactory;
import com.twc.dao.AccountDao;
import com.twc.service.AccountService;

/**
 * @Author: twc
 * @Date 2019/5/25 20:29
 **/
public class AccountServiceImpl implements AccountService {


    // 使用工厂模式创建dao的对象
     AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao","singleton");



    @Override
    public void saveAccount() {
        System.out.println("accountServiceImpl中的Service方法被执行");
        accountDao.save();


    }
}
