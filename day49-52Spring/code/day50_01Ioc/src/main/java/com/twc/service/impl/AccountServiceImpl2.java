package com.twc.service.impl;

import com.twc.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @Author: twc
 * @Date 2019/5/26 19:48
 **/
@Service("accountService2")
public class AccountServiceImpl2 implements AccountService {

    @Override
    public void saveAccount() {
        System.out.println("serviceImpl中的save方法被执行");

    }
}
