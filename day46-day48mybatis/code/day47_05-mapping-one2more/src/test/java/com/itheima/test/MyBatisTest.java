package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/20 15:17
 * @Description:测试
 *****/
public class MyBatisTest {

    private SqlSession sqlSession;

    private UserMapper userMapper;

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
        userMapper = sqlSession.getMapper(UserMapper.class);
        is.close();
    }


    /****
     * 一对多查询实现
     */
    @Test
    public void testOne2More(){
        User user = userMapper.one2More(1);
        System.out.println(user);
    }
     @Test
     public  void findAll(){
         List<User> userAccountList = userMapper.findUserAccountList();
         for (User user : userAccountList) {
             System.out.println(user);
         }
     }

    @After
    public void after(){
        //sqlSession.commit();
        sqlSession.close();
    }

}
