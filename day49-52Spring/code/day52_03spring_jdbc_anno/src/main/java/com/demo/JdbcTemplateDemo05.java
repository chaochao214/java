package com.demo;

import com.dao.AccountDao;
import com.dao.impl.AccountDaoImpl2;
import com.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2019/5/30 21:23
 **/
public class JdbcTemplateDemo05 {
    public static void main(String[] args) {
        ApplicationContext ac=  new ClassPathXmlApplicationContext("applicationContext-anno.xml");
        //这里为什么用接口  accountDao.class
        AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
        Account account = accountDao.findAccountById(1);
        System.out.println(account.getName());


    }
}
