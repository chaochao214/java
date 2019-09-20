package com.twc.jlyi;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class _07_2loginDemo {
    public static void main(String[] args) throws Exception {
        //输入账号密码
        Scanner sc = new Scanner(System.in);
        System.out.println( "请输入账号");
        String name = sc.nextLine();
        System.out.println("请输入密码");
        String password  = sc.nextLine();
        //使用SQL 去查询账号和密码
        Connection conn = JDBCUtils.getConnection();
        Statement  stmt  = conn.createStatement();
        String  sql = "SELECT*FROM  USER WHERE  NAME='admin' AND PASSWORD ='123';";

        ResultSet rs  = stmt.executeQuery(sql);
        if(rs.next()){
            System.out.println( "登陆成功,欢迎"+rs.getString("name"));
        }else{
            System.out.println("登陆失败，请重新登陆");
        }
        JDBCUtils.close(conn,stmt,rs);

    }
}
