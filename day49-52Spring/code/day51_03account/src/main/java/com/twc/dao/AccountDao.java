package com.twc.dao;

import com.twc.domain.Account;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/29 19:44
 **/
public interface AccountDao {
    // 查询所有用户信息的问
    List<Account> findAllAccount();

    Account findAccountByname(String sourceName);


    void updateAccout(Account source);
}
