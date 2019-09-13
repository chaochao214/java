package com.twc.keth._05JdbcDemoInfo.utils;


import com.twc.keth._05JdbcDemoInfo.anno.JdbcInfo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 包名:com.itheima.jdbc.utils
 * 作者:Leevi
 * 日期2019-04-06  10:42
 * 优化JdbcUtil
 * 使用配置文件的方式，解决硬编码问题
 * 什么是硬编码:1.常量的硬编码   --- 使用配置文件解决，配置文件有两种:1.properties文件  2.xml文件
 * 使用配置文件的话一定要注意,配置文件放在什么地方:类路径下
 * Java程序的目录结构:1.java文件夹里面放Java代码  2.lib文件夹里面放jar包 3.resources文件夹里面放配置文件
 * <p>
 * 2.实现类的硬编码  --- 使用面向接口编程解决
 * <p>
 * 当前类的类名.class.getClassLoader()获取类加载器对象
 * <p>
 * 类加载器的作用:将编译得到的字节码文件，加载进内存，形成字节码对象
 */
@JdbcInfo(url = "jdbc:mysql:///day17", password = "root")
public class JdbcUtil {
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    static {
        //从注解中读取数据
        //解析注解，获取注解上的数据
        //1.获取当前JdbcUtil类上的一个名字叫做"jdbcInfo"的注解
        Class<JdbcUtil> clazz = JdbcUtil.class;

        JdbcInfo info = clazz.getAnnotation(JdbcInfo.class);
        //2.获取注解对象的属性值
        url = info.url();
        driverClass = info.driverClass();
        ;
        username = info.username();
        password = info.password();

        //注册驱动
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接的方法
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

    /**
     * 关闭资源的方法
     *
     * @param conn
     * @param stm
     * @throws SQLException
     */
    public static void close(Connection conn, Statement stm) throws SQLException {
        close(conn, stm, null);
    }

    /**
     * 关闭资源的方法
     *
     * @param conn
     * @param stm
     * @param rst
     * @throws SQLException
     */
    public static void close(Connection conn, Statement stm, ResultSet rst) throws SQLException {
        if (rst != null) {
            rst.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
