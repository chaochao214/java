package com.twc.dao.impl;

import com.twc.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: twc
 * @Date 2019/5/26 19:44
 **/
@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao {
    public void saveAccount() {
        System.out.println("保存了账号2222");

    }
}
