package com.twc.jlyi;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

public class _02_2datapool implements DataSource {
    private int initCount  = 5;
    private int maxCount  =10;
    private int curCount  =0;
    //存储连接的容器
    private LinkedList<Connection> list  = new LinkedList<>();

    public _02_2datapool() throws SQLException, IOException {
        for (int i = 0; i < initCount; i++) {
            Connection connection   = createConnection();
            list.add(connection);
        }
    }
    //Connection方法
    private Connection createConnection() throws SQLException, IOException {
        Connection  connection  = JDBCUtils.getConnection();
        curCount++;
        return connection;

    }

    @Override
    public Connection getConnection() {
        if(list.size()>0){
            Connection connection = list.removeFirst();
            return connection;
        }
        if(curCount<maxCount){
            Connection connection  = null;
            try {
                connection = createConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return connection;
        }else{
            throw  new RuntimeException("已经达到了最大连接个数");
        }
    }
    //回收connection
    public void close(Connection connection){
        list.addLast(connection);
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
}
