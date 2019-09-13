package com.twc.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
    private static DataSource dataSource;
    static{
        //使用工厂创建 Druid连接池对象
        Properties properties  = new Properties();
        ClassLoader classLoader  = JDBCUtil.class.getClassLoader();
        InputStream  is = classLoader.getResourceAsStream("druidconfig.properties");
        try{
            properties.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    /**
     *
     *
     * 关闭资源的方法
     */
    public static  void close(Connection conn, Statement stm, ResultSet rst) throws SQLException {
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
