package com.twc.jliy;

public class _0102Student {
    static{
        System.out.println("静态代码块");
    }

    {
        //? 调用构造方法的时候被执行。
        System.out.println("构造代码块");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class c=_0102Student.class;
        System.out.println(c);
        System.out.println("方法2");
        _0102Student  s =  new _0102Student();
        System.out.println(s.getClass());
        System.out.println("方法三————————————————");
        Class  c3 = Class.forName("java.lang.String");
        System.out.println(c3);
        String name = c3.getSimpleName();
        System.out.println( name);

    }



}
