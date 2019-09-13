package com.twc.keth._03programing;

public class demo02 {
    public static void main(String[] args) {
        // lambda 作为参数使用。
            fun(()->{});
    }

    public static void fun(Runnable lambda) {

        /// 这里 实现了runnable接口，所以可以直接开启线程
      new Thread(lambda).start();
    }

}
