package com.twc.dao.impl;

import com.twc.dao.IAccountDao;
import com.twc.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/3 11:00
 **/
/*@Repository("accountDao")*/
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void save(Account account) {
        System.out.println("保存了所有账户");
    }

    @Override
    public List<Account> findAll() {
        System.out.println("查找了账户");
        return null;
    }
}
