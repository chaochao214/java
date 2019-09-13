package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/****
 * @Author:shenkunlin
 * @Date:2019/5/20 15:17
 * @Description:测试
 *****/
public class MyBatisTest {

    private SqlSession sqlSession;

    private AccountMapper accountMapper;

    @Before
    public void before() throws Exception{
        //读取配置文件,配置文件需要放在类路径下
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //通过SqlSessionBuilder对象构建一个SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = builder.build(is);

        //SqlSession
        //openSqlSession(false) default=false:手动提交
        //openSqlSession(true)  自动提交
        sqlSession = sqlSessionFactory.openSession();

        //创建一个UserDao
        //userDao = new UserDaoImpl(sqlSessionFactory);
        //getMapper(T.class)  给对象生成一个代理对象(创建了一个实现类)
        accountMapper = sqlSession.getMapper(AccountMapper.class);
        is.close();
    }

    /****
     * 一对一查询实现
     */
    @Test
    public void testOne2One(){
        int accountId=5;
        Account account = accountMapper.getAccountById(accountId);
        //Account

        System.out.println(account);
    }
    @Test
    public void test2(){
        Account ac2 = accountMapper.getAccountById2(2);
        System.out.println(ac2);
    }





    @After
    public void after(){
        //sqlSession.commit();
        sqlSession.close();
    }

}
