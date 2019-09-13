package com.twc.contraller;

import com.twc.service.AccountService;
import com.twc.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author: twc
 * @Date 2019/5/25 20:33
 **/
public class client {
    public static void main(String[] args) {
        // new Service初始化
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取service的bean
        // 获取方式1
        AccountService accountService = (AccountService) ac.getBean("AccountService");
        // 获取方式2：
        //  AccountService accountService2 = ac.getBean(AccountService.class) ;

        //怎么使用构造器方法创建对象的问题。
        AccountService accountService1 = new AccountServiceImpl("d", 1, new Date());


        accountService.saveAccount();
       /* AccountDao   accountDao  = (AccountDao) ac.getBean("AccountDao");
        accountService.*/


    }

}
