package com.twc;

import com.twc.domain.Account;
import com.twc.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: twc
 * @Date 2019/5/29 20:32
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test22 {
    @Autowired
    private AccountService as;

    @Test
    public void testTransfer() {
        as.transfer("aaa", "bbb", 100f);


    }

}
