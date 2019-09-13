package com.dao.impl;

import com.dao.AccountDao;
import com.domin.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/26 20:31
 **/
public class AccountDaoImpl implements AccountDao {


    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;

    }

    @Override
    public List<Account> findAllAccount() {
        try {
            return  runner.query("select*from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
             throw new RuntimeException(e);
        }


    }

    @Override
    public Account findAccountById(Integer accountId) {
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void deleteAccount(Integer accountId) {

    }
}
