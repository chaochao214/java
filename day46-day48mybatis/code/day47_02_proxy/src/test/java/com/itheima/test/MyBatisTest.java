package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.mapper.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/20 15:17
 * @Description:测试
 *****/
public class MyBatisTest {


    private UserDao userDao;

    private SqlSession sqlSession;

    @Before
    public void before() throws Exception {
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
        userDao = sqlSession.getMapper(UserDao.class);

        is.close();
    }

    /***
     * 根据用户名查询用户信息
     */
    @Test
    public void testFindById() {
        User user = userDao.findByUserId(1);
        System.out.println(user);
    }


    /****
     * 根据用户名查询用户信息
     */
    @Test
    public void testFindByUserName() {
        String username = "张";
        List<User> users = userDao.findByUserName(username);
        for (User user : users) {
            System.out.println(user);
        }
    }

    /****
     * 增加用户
     */
    //添加用户失败
    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUsername("王六");
        user.setAddress("帝都");
        user.setSex("男");
        user.setBirthday(new Date());
        userDao.saveUser(user);
    }


    @After
    public void after() {
        //sqlSession.commit();
        sqlSession.close();
    }

}
