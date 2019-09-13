package com.dao.impl;

import com.dao.AccountDao;
import com.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/31 8:46
 **/
 @Repository("accountDao")
public class AccountDaoImpl2 extends JdbcDaoSupport implements AccountDao {

     //放到属性上，也可以放置到set方法上，将spring容器的对象，通过set的形参传递给该方法
     @Autowired
     public void setDi(DataSource dataSource){
          super.setDataSource(dataSource);
     }


    //这里全都改用父类的getJdbcTemplate 方法，
    @Override
    public Account findAccountById(Integer accountId) {
        List<Account> accounts = super.getJdbcTemplate().query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), accountId);
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> accounts = super.getJdbcTemplate().query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if (accounts.isEmpty()) {
            return null;
        }
        if (accounts.size() > 1) {
            throw new RuntimeException("结果集不唯一");
        }
        return accounts.get(0);
    }

    @Override
    public void updateAccount(Account account) {
        super.getJdbcTemplate().update("update account set name=?,money=? where id=?", account.getName(), account.getMoney(), account.getId());
    }
}
