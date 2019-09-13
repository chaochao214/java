package com.demo;

import com.dao.AccountDao;
import com.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: twc
 * @Date 2019/5/30 21:23
 **/
public class JdbcTemplateDemo04 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao  = ac.getBean("accountDao",AccountDao.class);
        Account account  = accountDao.findAccountById(4);
        System.out.println(account);

        account.setMoney(33333f);
        accountDao.updateAccount(account);


    }
}
