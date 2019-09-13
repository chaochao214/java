package com.twc.test;

import com.twc.utils.JdbcUtil_2;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
    @Test
    public void test() throws SQLException {
        Connection conn  = JdbcUtil_2.getConnetion();
        Statement stm = conn.createStatement();
        String sql = "select*from user where id =1";
        ResultSet rst  = stm.executeQuery(sql);
        rst.next();//将游标向下移动一行，获取该行数据
        int id = rst.getInt("id");
        String uname = rst.getString("username");
        String pwd = rst.getString("password");
        String address = rst.getString("address");
        String nickname = rst.getString("nickname");
        System.out.println(uname);
        JdbcUtil_2.close(conn,stm,rst);

    }


}
