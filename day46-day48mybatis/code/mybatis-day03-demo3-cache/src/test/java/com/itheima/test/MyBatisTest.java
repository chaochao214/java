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

/****
 * @Author:shenkunlin
 * @Date:2019/5/20 15:17
 * @Description:测试
 *****/
public class MyBatisTest {


    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession1;

    private UserMapper userMapper;

    @Before
    public void before() throws Exception{
        //读取配置文件,配置文件需要放在类路径下
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //通过SqlSessionBuilder对象构建一个SqlSessionFactory
        sqlSessionFactory = builder.build(is);

        //SqlSession
        //openSqlSession(false) default=false:手动提交
        //openSqlSession(true)  自动提交

        //创建一个UserDao
        //userDao = new UserDaoImpl(sqlSessionFactory);
        //getMapper(T.class)  给对象生成一个代理对象(创建了一个实现类)
        is.close();
    }


    /****
     * 二级缓存测试
     */
    @Test
    public void testTwoCache(){
        //开启SqlSession1
        sqlSession1 = sqlSessionFactory.openSession();
        userMapper = sqlSession1.getMapper(UserMapper.class);
        //SqlSession1查询数据
        User user1 = userMapper.getUserByUserName("王哈哈");
        System.out.println(user1);

        //SqlSession1.close->会将一级缓存压入到二级缓存
        sqlSession1.close();

        //创建SqlSession2
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);

        //执行SqlSession1所执行过的操作（查询）
        User user2 = userMapper2.getUserByUserName("王哈哈");
        System.out.println(user2);

        //如果SqlSession2不执行数据库操作，则表明二级缓存存在
    }




    /***
     * 1级缓存测试
     *  以及缓存：默认开启
     */
    @Test
    public void testOneCache(){
        sqlSession1 = sqlSessionFactory.openSession();
        userMapper = sqlSession1.getMapper(UserMapper.class);
        User user1 = userMapper.getUserByUserName("王哈哈");
        System.out.println(user1);

        //增删改、commit、close、clearCache->会清理一级缓存
        sqlSession1.clearCache();

        User user2 = userMapper.getUserByUserName("王哈哈");
        System.out.println(user2);
    }


    @After
    public void after(){
        //sqlSession1.commit();
        sqlSession1.close();
    }

}
