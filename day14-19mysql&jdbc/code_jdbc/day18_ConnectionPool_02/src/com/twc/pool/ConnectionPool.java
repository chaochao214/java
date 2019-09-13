package com.twc.pool;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

public class ConnectionPool implements DataSource {
    private static String driverClass;
    private static String username;
    private static String password;
    private static String url;

    private LinkedList<Connection> connections = new LinkedList<>();

    static {
        Properties properties = new Properties();
        ClassLoader classLoader = ConnectionPool.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        try {
            properties.load(is);
            driverClass = properties.getProperty("driverClass");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //注册驱动
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Integer getCount(){
          return connections.size();
    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection conn = null;
        if(connections.size()>0){
            //容器中还有连接
            conn = connections.removeFirst();
        }else{
            //容器中没有连接了，则新建连接
             conn = DriverManager.getConnection(url,username,password);
        }
        return  conn;
    }
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
}

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
    /**
     *
     */

}
