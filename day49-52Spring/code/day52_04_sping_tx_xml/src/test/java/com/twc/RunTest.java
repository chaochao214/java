package com.twc;

import com.twc.domain.Account;
import com.twc.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: twc
 * @Date 2019/5/31 10:19
 **/
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RunTest {
     @Autowired
    AccountService accountService;
     @Test
     public void transfer(){
          accountService.transfer("aaa","bbb",1f);
     }
}
