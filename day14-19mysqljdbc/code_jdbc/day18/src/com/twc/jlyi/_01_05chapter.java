package com.twc.jlyi;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class _01_05chapter {
    public static void main(String[] args) throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "INSERT INTO employee VALUES (NULL,?,?,?);";

        PreparedStatement psmt  = conn.prepareStatement(sql);
        psmt.setString(1,"刘德华");
        psmt.setInt(2,57);
        psmt.setString(3,"香港");
        int i = psmt.executeUpdate();
        System.out.println("影响的行数"+i);
    }

}
