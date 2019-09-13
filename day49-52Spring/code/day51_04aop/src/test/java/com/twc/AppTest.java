package com.twc;

import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AppTest {
    @Autowired
    private AccountService as;

    @Test
    public void proxy() {
        as.saveAccount();
       /* as.updateAccount(1);
        as.deleteAccount();
*/

    }


}

