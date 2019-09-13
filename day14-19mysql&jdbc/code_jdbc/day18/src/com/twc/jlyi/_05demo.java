package com.twc.jlyi;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class _05demo {
    public static void main(String[] args) throws Exception {
        //加载配置文件中的配置参数
        InputStream  is = _05demo.class.getResourceAsStream("/druid.properties");
        Properties pp  = new Properties();
        pp.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(pp);
        Connection conn= ds.getConnection();
        String sql = "INSERT  INTO student VALUES (3,2,99.5);";

        PreparedStatement pstmt   =conn.prepareStatement(sql);
        int i =pstmt.executeUpdate();
        System.out.println("影响的行数"+i);
        pstmt.close();
        conn.close();


    }
}
