package com.twc.jlyi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _06chapter {
    public static void main(String[] args) {
        //?为什么单独写到外面
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql:///day17","root","root");
            conn.setAutoCommit(false);
            Statement psmt  = conn.createStatement();
            //sql语句出了问题
            String sql = "UPDATE account SET balance = balance-500 WHERE id=1;";
            psmt.executeUpdate(sql);
            psmt.close();
            System.out.println("成功，提交事务");
            conn.commit();
        }catch (Exception e){
            try{
                System.out.println( "出了异常，回滚事务");
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }


    }
}
