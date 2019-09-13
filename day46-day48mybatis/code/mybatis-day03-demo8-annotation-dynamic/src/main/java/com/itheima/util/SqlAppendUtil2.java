package com.itheima.util;

import org.apache.ibatis.jdbc.SQL;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/25 8:53
 * @description: 组装 SQL 语句
 **/
public class SqlAppendUtil2 {
    public String list(Object instance) throws IllegalAccessException {
        //获取实例对象的字节码对象
        Class<?> clazz = instance.getClass();
        //组装的条件
        List<String> condittionList = new ArrayList<String>();
        // 实例不为空，则拼接条件
        if (instance != null) {
            Field[] files = clazz.getDeclaredFields();
            for (Field file : files) {
                file.setAccessible(true);
                //获取当前的属性
                Object value = file.get(instance);
                if (value != null) {
                    condittionList.add(file.getName() + "=#{" + file.getName() + "}");
                }

            }
        }
        // 将list转换成String类型
        String[] conditionArray = new String[condittionList.size()];
        condittionList.toArray(conditionArray);
        SQL sql = new SQL();
        sql.SELECT("*").FROM("user").WHERE(conditionArray);
        return sql.toString();

    }
}
