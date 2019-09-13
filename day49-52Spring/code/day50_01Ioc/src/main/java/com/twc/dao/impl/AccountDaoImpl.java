package com.twc.dao.impl;

import com.twc.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: twc
 * @Date 2019/5/26 19:44
 **/
@Repository("accountDao1")
public class AccountDaoImpl implements AccountDao {
    public void saveAccount() {
        System.out.println("保存了账号");

    }
}
