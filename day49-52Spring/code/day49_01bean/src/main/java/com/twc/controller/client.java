package com.twc.controller;

import com.twc.service.AccountService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2019/5/25 20:08
 **/

public class client {

    @Before
    public void test01() {


    }
//实例化bean的方式一：无参构造器的方式
    @Test
    public void testNoCons() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.saveAccount();

    }
//实例化bean的方式三：非静态的实例工厂问题
    @Test
    public void testNonStaticFac() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService3");
        as.saveAccount();

    }
//    实例化bean的方式二 ：静态工厂实例化
    @Test
    public  void    testStaticFactory(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService2");
        as.saveAccount();
    }

}
