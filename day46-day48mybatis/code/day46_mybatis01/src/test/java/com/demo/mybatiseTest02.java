package com.demo;

import com.demo.domain.User;
import com.demo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/20 20:32
 **/
public class mybatiseTest02 {
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void init() {
        try {
            //1.读取主配置文件(SqlMapConfig.xml)，获取配置文件的字节输入流
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

            //2.创建一个SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            //3.构建SqlSessionFactory(会话工厂对象)
            SqlSessionFactory sqlSessionFactory = builder.build(is);

            //4.打开一个SqlSession，拥有Connection的作用
            sqlSession = sqlSessionFactory.openSession();

            //5.通过SqlSession获取对应Dao的代理类
            userMapper = sqlSession.getMapper(UserMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 查询 所有
         */
    }

    @Test
    public void testFindAll2() {
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        ;


    }

    @After
    public void destroy() {
        sqlSession.close();
    }
}
