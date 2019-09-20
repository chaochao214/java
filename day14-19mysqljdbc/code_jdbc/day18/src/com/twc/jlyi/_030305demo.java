package com.twc.jlyi;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.StatementImpl;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class _030305demo {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource cpds   = new ComboPooledDataSource();

        Connection conn = cpds.getConnection();
        String sql  = "INSERT  INTO student VALUES (2,2,99.5);";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        int i =pstmt.executeUpdate();

        pstmt.close();
        conn.close();



    }
}
