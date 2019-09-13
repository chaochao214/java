package com.twc.contraller;

import com.twc.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: twc
 * @Date 2019/6/1 10:46
 **/
public class client2{
     //测试属性注入
    @Test
    public  void  test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountServiceImpl2");
        as.saveAccount();
    }
    // 测试在service中注入dao
    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
      AccountService as= (AccountService) ac.getBean("accountServiceImpl3");
    as.saveAccount();
    }

}
