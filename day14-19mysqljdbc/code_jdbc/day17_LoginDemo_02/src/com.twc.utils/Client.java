package com.twc.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws SQLException {
        Scanner sc =   new Scanner(System.in);
        System.out.println("请输入账号");
        String user = sc.nextLine();
        System.out.println("请输入密码");
        String pass = sc.nextLine();
        String sql = "select * from user where username='"+user+"' and password='"+pass+"'";

        Connection conn =  JdbcUtil.getConnetion();
        Statement st = conn.createStatement();
        ResultSet rst = st.executeQuery(sql);
        if(rst.next()){
            System.out.println("登陆成功");
        }

        JdbcUtil.close(conn,st,rst);

    }
    @Test
    public void test() throws SQLException {

        Connection conn = JdbcUtil.getConnetion();
        Statement st = conn.createStatement();
        ResultSet rst = st.executeQuery("select*from user");
        rst.next();
        String string = rst.getString(1);
        System.out.println( string);
        JdbcUtil.close(conn,st, rst);

    }



}
