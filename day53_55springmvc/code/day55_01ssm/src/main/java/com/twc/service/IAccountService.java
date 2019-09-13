package com.twc.service;

import com.twc.domain.Account;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/3 10:50
 **/
public interface IAccountService {
    /**
     * 保存账户
     */
    void saveAccount(Account account);
    /**
     *  查询所有账户
     *
     */
    List<Account> findAllAccount();


}

