package com.twc.test;

import com.twc.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2019/5/26 19:56
 **/
public class client {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.saveAccount();
        // ((ClassPathXmlApplicationContext) ac).close();
        ac.close();
    }
}
