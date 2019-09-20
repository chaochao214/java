package com.twc.jliy;

import java.lang.reflect.Constructor;

public class studentTest {
    public static void main(String[] args) throws Exception {
        test04();
    }
    public static void test04()   throws Exception{
        //无法理解
        System.out.println( "test04");
        Class c = Student.class;
        Constructor[] cons = c.getConstructors();
        for(Constructor con :cons){
            System.out.println( con);
        }


    }
}
