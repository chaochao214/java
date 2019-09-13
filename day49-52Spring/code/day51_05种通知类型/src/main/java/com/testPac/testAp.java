package com.testPac;

import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: twc
 * @Date 2019/5/30 10:48
 **/
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testAp {
    @Autowired
    private AccountService as;

    @Test
    public void proxy() {
        as.saveAccount();
        as.updateAccount(1);
        as.deleteAccount();


    }


}
