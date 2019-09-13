package com.itheima.util;

import com.itheima.domain.User;
import org.apache.ibatis.jdbc.SQL;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 18:40
 * @Description:
 *  组装SQL语句
 *****/
public class SqlAppendUtil {


    /****
     * SELECT * FROM USER WHERE username=? and sex=? and address=?
     * SQL语句组装方法
     * @param user
     * @return
     */
    public String userList(User user){
        //组装的条件
        List<String> condtionList = new ArrayList<String>();

        //组装SQL条件
        if(user!=null){
            //拼接组装username条件
            if(user.getUsername()!=null && !user.getUsername().equals("")){
                condtionList.add("username=#{username}");
            }

            //拼接组装sex条件
            if(user.getSex()!=null && !user.getSex().equals("")){
                condtionList.add("sex=#{sex}");
            }

            //拼接组装address条件
            if(user.getAddress()!=null && !user.getAddress().equals("")){
                condtionList.add("address=#{address}");
            }
        }

        //将List转成Array
        String[] condtionArray =new String[condtionList.size()];
        condtionList.toArray(condtionArray);

        SQL sql = new SQL();
        sql.SELECT("*").FROM("user").WHERE(condtionArray);
        return sql.toString();
    }


    /****
     * SELECT * FROM USER WHERE username=? and sex=? and address=?
     * SQL语句组装方法
     * @param instance
     * @return     */
    public String list(Object instance) throws IllegalAccessException {
        //获取实例对象的字节码对象
        Class<?> clazz = instance.getClass();
        //组装的条件
        List<String> condtionList = new ArrayList<String>();

        //实例不为空，则拼接条件
        if(instance!=null){
            //获取当前字节码对象的所有属性
            Field[] files = clazz.getDeclaredFields();

            //循环所有属性
            for (Field file : files) {
                //暴力破解
                file.setAccessible(true);

                //获取当前属性值，如果不为空，则拼接
                Object value = file.get(instance);
                if(value!=null){
                    //循环拼接条件
                    condtionList.add(file.getName()+"=#{"+file.getName()+"}");
                }

            }
        }

        //将List转成Array
        String[] condtionArray =new String[condtionList.size()];
        condtionList.toArray(condtionArray);

        SQL sql = new SQL();
        sql.SELECT("*").FROM("user").WHERE(condtionArray);
        return sql.toString();
    }

}
