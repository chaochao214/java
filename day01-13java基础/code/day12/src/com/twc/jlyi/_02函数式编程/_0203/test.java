package com.twc.jlyi._02函数式编程._0203;

public class test {
    public static void main(String[] args) {
        pirntParam(()-> "hello");
    }
    private static void  pirntParam(MySupplier supplier){
        System.out.println( supplier.get());
    }
}
