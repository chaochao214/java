package com.twc.zoye.zoye1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTest {
    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/day17";
        //Connection conn  =  null;
        Statement  stmt  = null;
        try{
            Class.forName("com.sql.jdbc.Driver");
            Connection conn  = DriverManager.getConnection(url,"root","root");
            stmt = conn.createStatement();
            // int row = stmt.executeUpdate(sql)

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
