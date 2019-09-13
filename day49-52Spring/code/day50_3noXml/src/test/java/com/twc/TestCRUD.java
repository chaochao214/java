package com.twc;

import com.config.SpringConfigRation;
import com.domin.Account;
import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/29 10:51
 **/
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfigRation.class)
public class TestCRUD {
    @Autowired
    AccountService accountService;

    @Test
    public void findAllTest() {
        List<Account> allAccount = accountService.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }
}
