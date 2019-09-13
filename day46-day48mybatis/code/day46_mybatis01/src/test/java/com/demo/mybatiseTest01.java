package com.demo;

import com.demo.domain.User;
import com.demo.mapper.UserMapper;
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
 * @Date 2019/5/20 20:21
 **/
public class mybatiseTest01 {
    @Test
    public void test01() throws IOException {
        //读取配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //通过SqlSessionBuilder对象构建一个SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = builder.build(is);

        //通过SqlSessionFactory构建一个SqlSession
        SqlSession session = sqlSessionFactory.openSession();

        //通过SqlSession实现增删改查
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> users = userMapper.findAll();

        //打印输出
        for (User user : users) {
            System.out.println(user);
        }
        //关闭资源
        session.close();
        is.close();
    }


}
