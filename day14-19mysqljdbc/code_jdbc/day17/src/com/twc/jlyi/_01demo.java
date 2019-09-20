package com.twc.jlyi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _01demo {
    public static void main(String[] args) throws Exception{
        // class.forname是个什么东西
        /**
         *
         *
         */
        Class.forName("com.mysql.jdbc.Driver");

        Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/day17","root","root");
        System.out.println( conn);
        Statement stmt  =conn.createStatement();
        //插入记录
        String sql = "Insert into category (cname) values ('手机');";
        int i = stmt.executeUpdate( sql);
        System.out.println("影响的行数"+i);
        // resultSet结果集。
        String sqlEX = "Select*From  category;";
        ResultSet rs = stmt.executeQuery(sqlEX);
        while(rs.next()){
            int cid  = rs.getInt("cid");
            String cname  = rs.getString("cname");
            System.out.println(cid + "==="+cname);
        }
        stmt.close();
        conn.close();

    }
}
