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
import java.util.Date;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/20 15:17
 * @Description:测试
 *****/
public class MyBatisTest {

    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession;

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
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);

        //创建一个UserDao
        //userDao = new UserDaoImpl(sqlSessionFactory);
        //getMapper(T.class)  给对象生成一个代理对象(创建了一个实现类)
        is.close();
    }



    /****
     * 增加用户
     */
    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("哈哈笑白");
        user.setAddress("天津");
        user.setSex("男");
        user.setBirthday(new Date());
        userMapper.addUser(user);
    };

    /****
     * 根据ID修改数据
     * id=#{id},username=#{username}
     */
    @Test
    public void  testUpdateUser(){
        User user = new User();
        user.setUsername("王美丽");
        user.setAddress("深圳");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setId(1);
        userMapper.updateUser(user);
    }


    /****
     * 删除
     */
    @Test
    public void testDeleteUser(){
        int userid=24;
        userMapper.deleteUser(userid);
    }

    /****
     * 查询
     */
    @Test
    public void testList(){
        List<User> users = userMapper.list();
        for (User user : users) {
            System.out.println(user);
        }
    }


    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
    }

}
