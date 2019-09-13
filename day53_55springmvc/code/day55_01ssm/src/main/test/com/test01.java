package com;

import com.twc.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2019/6/3 11:03
 **/
public class test01 {
    public static void main(String[] args) {
        ApplicationContext  ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.findAllAccount();
    }
}
