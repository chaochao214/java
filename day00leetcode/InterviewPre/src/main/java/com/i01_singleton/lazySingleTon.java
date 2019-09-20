package com.i01_singleton;

/**
 * @Author: twc
 * @Date 2019/5/27 11:24
 **/
//多线程不安全的问题
public class lazySingleTon {
    private static  lazySingleTon lazy;

    public lazySingleTon() {
    }

    public static lazySingleTon getLazy() {
        if (lazy==null) {
             // 多线程不安全，按需加载
              lazy =new lazySingleTon();
        }
        return lazy;
    }
}
