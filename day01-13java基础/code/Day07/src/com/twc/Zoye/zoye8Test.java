package com.twc.Zoye;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zoye8Test {
    public static void main(String[] args) {
        // 创建线程池对象
        ExecutorService  service  = Executors.newFixedThreadPool(2);
        //创建runnable实例对象
        zoye8 r = new zoye8();
        //自己创建对俩的方式
        service.submit(r);
        service.submit(r);

    }
}
