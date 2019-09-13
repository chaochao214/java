package com.twc.jlyi;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    //??? 不理解的地方要标记。
    private static  DataSource dataSource   =new ComboPooledDataSource();
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql:///day17";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static DataSource getDataSource() {
        return dataSource;
    }

    static {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException, IOException {
        // getResourceAsStream  获取具有指定名称的资源
        InputStream is = JDBCUtils.class.getResourceAsStream("/jdbc.properties");
        Properties pp = new Properties();
        pp.load(is);
        //pp加载总失败
        Connection  conn  = DriverManager.getConnection(URL,pp);
        //Connection conn = DriverManager.getConnection(URL, "root", "root");

        return conn;
    }


    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
