package com.twc.contraller;

import com.twc.Factory.BeanFactory;
import com.twc.dao.AccountDao;
import com.twc.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2019/5/25 20:33
 **/
public class client {
    public static void main(String[] args) {
//bug
        AccountService accountService = (AccountService) BeanFactory.getBean("accountService", "singleton");



        accountService.saveAccount();


    }

}
