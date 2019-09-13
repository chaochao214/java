package com.twc.service;

import com.twc.domain.Account;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/29 19:47
 **/
public interface AccountService {


    //查询所有的用户信息问题
    List<Account> findAllAccount();
    // 转账
    void transfer(String sourceName,String targetName,Float money);
}
