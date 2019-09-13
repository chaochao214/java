package com;

import com.twc.dao.IAccountDao;
import com.twc.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @Author: twc
 * @Date 2019/6/3 21:00
 **/
public class TestMybatis {
    @Test
    public void testFindAll() throws IOException {
//         加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 创建 sqlSession对象
        SqlSession sqlSession = sessionFactory.openSession();
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        List<Account> lsit = accountDao.findAll();
        for (Account account : lsit) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }

    @Test
    public void testSave() throws IOException {
        Account account = new Account();
        account.setName("小菲");
        account.setMoney(400f);

// 加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 创建工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 创建sqlSession对象
        SqlSession sqlSession = sessionFactory.openSession();
        // 获取代理对象
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
        // 数据插入失败
        accountDao.save(account);

        // 提交事务
        sqlSession.commit();
        in.close();
    }

}
