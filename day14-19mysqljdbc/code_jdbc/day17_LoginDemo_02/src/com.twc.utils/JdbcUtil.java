package com.twc.utils;

import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {

    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    static {
        //配置文件中读取到数据，再将这些数据赋值给成员变量
        Properties properties = new Properties();
        ClassLoader classLoader = JdbcUtil.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbcinfo.properties");
        // 为什么要写在静态代码块里面

        try {
            properties.load(is);
            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            Class.forName(driverClass);
        } catch (IOException e) {
            e.printStackTrace();
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
    public static Connection getConnetion() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
//出现了静态方法的类中还能有普通方法么？
    public String test() {
        return " ";
    }





    public static void close(Connection conn, Statement stm, ResultSet rst) throws SQLException {
        if(rst!= null){
            rst.close();
        }
        if(stm!= null){
            stm.close();
        }
        if(conn!= null){
             conn.close();
        }
    }

}
