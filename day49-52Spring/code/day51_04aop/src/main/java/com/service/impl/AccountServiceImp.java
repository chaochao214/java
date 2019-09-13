package com.service.impl;

import com.service.AccountService;

/**
 * @Author: twc
 * @Date 2019/5/30 10:22
 **/
public class AccountServiceImp implements AccountService {

    @Override
    public void saveAccount() {
        System.out.println("保存");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("更新");
    }

    @Override
    public int deleteAccount() {
        System.out.println("删除");
        return 0;
    }
}
