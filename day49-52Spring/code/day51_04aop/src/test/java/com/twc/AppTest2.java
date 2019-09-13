package com.twc;

import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: twc
 * @Date 2019/6/2 9:51
 **/
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  "classpath:applicationContext.xml")
public class AppTest2 {
     @Autowired
     private AccountService accountService;

    /**
     * 这个面向切面编程的意义什么？
     *
     *  在访问目标对象之前输出了日志
     *
     */
    @Test
        public  void proxy(){
         //方法的执行问题
         accountService.saveAccount();
     }

}
