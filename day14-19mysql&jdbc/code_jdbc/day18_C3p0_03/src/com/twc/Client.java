package com.twc;

import com.twc.domin.User;
import com.twc.utis.JDBCUtil;
import org.junit.Test;

import java.sql.*;

public class Client {
    @Test
    public void testFindUserbyId () throws SQLException{
        //获取连接对象
        Connection conn = JDBCUtil.getConnection();
        String sql = "select*from user where id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, 1);
        ResultSet rst = pst.executeQuery();
        rst.next();
        int id = rst.getInt("id");
        String username = rst.getString("username");
        String password = rst.getString("password");
        String address = rst.getString("address");
        String nickname = rst.getString("nickname");

        User user = new User(id,username,password,address,nickname);
        System.out.println(user);
        JDBCUtil.close(conn,pst,rst);
    }
    @Test
    public void test2() throws SQLException {
        Connection conn1  = JDBCUtil.getConnection();
        conn1.close();

    }
}
