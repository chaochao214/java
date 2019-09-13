package com.twc.dao.impl;

import com.twc.dao.AccountDao;
import com.twc.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/5/30 15:59
 * @Version V1.0
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    // 主键查询
    public Account findAccountById(Integer id) {
        Account account = this.getJdbcTemplate().queryForObject("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class),id);
        return account;
    }

    // 使用账号名称查询返回唯一结果集
    public Account findAccountByName(String name) {
        List<Account> list = this.getJdbcTemplate().query("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if(list.isEmpty()){
            return null;
        }
        else if(list!=null && list.size()>1){
            throw new RuntimeException("结果集不能大于1");
        }
        return list.get(0);
    }

    // 更新
    public void updateAccount(Account account) {
        this.getJdbcTemplate().update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
