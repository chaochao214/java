package com.twc.keth._01reflect.BeanFactory;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

/**
 * 创建对象，将配置文件的属性
 */
public class NBBeanFactory {
    public static Object createBean() {
        //每次获取java对象都去读取配置文件的信息
        ResourceBundle bundle = ResourceBundle.getBundle("info");
        //获取类的全限定名
        String className = bundle.getString("className");
        try {
            Class<?> clazz = Class.forName(className);
            //创建对象
            Object obj = clazz.newInstance();
            //创建对象的属性
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String name = field.getName();
                String value = bundle.getString(name);
                //判断，属性是否是私有的
                if (field.getModifiers() == Modifier.PRIVATE) {
                    field.setAccessible(true);
                }
                //要进行类型转换(是一个很复杂的过程)
                if (field.getType() == int.class) {
                    //表示这个字段是int；类型，所以我们要将值转换成int
                    int num = Integer.parseInt(value);
                    //将它设置到field中去
                    field.set(obj, num);
                } else {
                    //不是int那么就是String
                    field.set(obj, value);
                }
            }
            return  obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // 静态方法可以直接调用
        Object obj  =  NBBeanFactory.createBean();
        System.out.println(obj);
    }

}
