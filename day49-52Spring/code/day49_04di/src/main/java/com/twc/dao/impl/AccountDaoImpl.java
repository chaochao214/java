package com.twc.dao.impl;

import com.twc.dao.AccountDao;

/**
 * @Author: twc
 * @Date 2019/5/25 20:27
 **/
public class AccountDaoImpl implements AccountDao {

    @java.lang.Override
    public void save() {
        System.out.println("dao层中的save方法被执行");
    }
}
