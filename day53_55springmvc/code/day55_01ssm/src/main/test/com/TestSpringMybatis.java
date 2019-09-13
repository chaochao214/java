package com;

import com.twc.dao.IAccountDao;
import com.twc.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/3 21:52
 **/
public class TestSpringMybatis {


    //这个 Repository的标记位置，是在 accountDao,还是AccountDaoImpl,标记错位置为什么会报错
    @Test
    public void testFindAllSpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountDao bean = ac.getBean(IAccountDao.class);
        List<Account> all = bean.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

    }

}
