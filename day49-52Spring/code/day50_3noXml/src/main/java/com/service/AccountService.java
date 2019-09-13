package com.service;

import com.domin.Account;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/26 20:36
 **/
public interface AccountService {
    List<Account> findAllAccount();
}
