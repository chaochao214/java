package com.dao;

import com.domain.Account;

/**
 * @Author: twc
 * @Date 2019/5/31 8:44
 **/
public interface AccountDao {
    /**
     *  根据id查找用户
     */
    Account findAccountById(Integer accountId);
    Account findAccountByName(String name);
    void  updateAccount(Account account);

}
