package com.Test;

import com.config.SpringConfigRation;
import com.domin.Account;
import com.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/27 9:31
 **/
public class AccountServiceTest2 {

    @Test
    public void testFindAll() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigRation.class);




        AccountService as = (AccountService) ac.getBean("accountService");

        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }
}
