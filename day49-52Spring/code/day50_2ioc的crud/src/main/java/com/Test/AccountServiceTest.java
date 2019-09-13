package com.Test;

import com.domin.Account;
import com.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/26 20:41
 **/
public class AccountServiceTest {
    @Test
    public void testFindAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        //执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
