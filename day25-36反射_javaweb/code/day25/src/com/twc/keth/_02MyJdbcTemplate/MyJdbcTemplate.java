package com.twc.keth._02MyJdbcTemplate;

import javax.sql.DataSource;
import java.lang.reflect.Method;
import java.sql.*;

public class MyJdbcTemplate {
    private DataSource dataSource;

    public MyJdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public <T> T queryForObject(String sql,Class<T> clazz,Object ... params){
         //1. 获取连接
         try{
             Connection conn = dataSource.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ParameterMetaData parameterMetaData = pstm.getParameterMetaData();
             int paramterCount = parameterMetaData.getParameterCount();
             for (int i = 0; i < paramterCount; i++) {
                  pstm.setObject(i,params[i-1]);
             }
             ResultSet rst   = pstm.executeQuery();
             rst.next();
             T t = clazz.newInstance();
             // 调用对象的set方法进行参数的设置，调用的set方法名字+ 字段名

             ResultSetMetaData rstMetaData  = rst.getMetaData();
             int columnCount = rstMetaData.getColumnCount();
                //获取javaBean的公用方法
             Method[] methods = clazz.getMethods();
             for(int i=1;i<=columnCount;i++){
                 String columnName = rstMetaData.getColumnName(i);
                 System.out.println(columnName);
                 //获取字段值
                 Object value = rst.getObject(columnName);
                 //遍历出每一个方法
                 for (Method method : methods) {
                     String methodName = method.getName();

                     //判断方法名是否是"set"+字段名，忽略大小写
                     if (methodName.equalsIgnoreCase("set"+columnName)) {
                         //说明这个方法就是用于设置这个字段的，那么就调用这个方法
                         method.invoke(t,value);
                     }
                 }
             }
             rst.close();
             pstm.close();             conn.close();;

             return t;
         } catch (Exception e) {
             e.printStackTrace();
             throw  new RuntimeException(e.getMessage());
         }
    }
}
