package com.twc.utils;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @Author: twc
 * @Date 2019/5/29 20:56
 **/
public class ConnectionUtils {
    private ThreadLocal<Connection> t1 = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取当前线程的连接
     */
    public Connection getThreadConnection() {

        try {
            Connection conn = t1.get();
            if (conn == null) {
                conn = dataSource.getConnection();
                t1.set(conn);
            }
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 连接和线程解绑
     */
    public void removeConnection() {
        t1.remove();
    }
}

