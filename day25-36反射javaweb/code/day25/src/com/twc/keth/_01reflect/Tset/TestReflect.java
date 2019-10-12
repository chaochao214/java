package com.twc.keth._01reflect.Tset;


import com.twc.keth._01reflect.BeanFactory.BeanFactory;
import com.twc.keth._01reflect.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestReflect {
    @Test
    public void test01() throws ClassNotFoundException {
        /**
         * 获取字节码对象的三种方式
         *1. 类名.class
         * 2.类名。forname
         */

        Class<Student> clazz = Student.class;
        Class<?> clazzA = Class.forName("com.twc.keth._01reflect.Student");
        Student student = new Student();
        Class<? extends Student> clazzB = student.getClass();
    }

    @Test
    public void test02() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("com.twc.keth._01reflect.Student");

        Object obj = clazz.newInstance();
        System.out.println(obj);

    }

    @Test
    public void test03() {
        Student student = BeanFactory.getBean(Student.class);

    }

    @Test
    public void test04() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("com.twc.keth._01reflect.BeanFactory.BeanFactory");
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Object obj = constructor.newInstance(18, "深圳福田");
        System.out.println(obj);

    }
    @Test
    public void test05() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.twc.keth._01reflect.Student");
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        //06

    }
}
