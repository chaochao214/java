package com.twc.jlyi._03方法引用.demo通过方法名引用成员方法;

public class test {
    public static void main(String[] args) {
        //  这里为什么需要new 一个assistant对象

        fun(new Assistant()::dealFile);

    }
    //参数的类型要保持一致。
    public static  void fun(workHelper lambda){
        lambda.help("机密文件");
    }
}
