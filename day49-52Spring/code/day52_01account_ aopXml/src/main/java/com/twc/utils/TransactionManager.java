package com.twc.utils;

import java.sql.SQLException;

/**
 * @Author: twc
 * @Date 2019/5/29 21:05
 **/
public class TransactionManager {
    private ConnectionUtils connectionUtils;
    public  void  setConnectionUtils(ConnectionUtils connectionUtils){
          this.connectionUtils=connectionUtils;
    }
    /**
     *  开启事务
     */
    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *  提交事务
     */
    public  void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();
            connectionUtils.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
