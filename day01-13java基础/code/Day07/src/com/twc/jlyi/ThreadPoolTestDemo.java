package com.twc.jlyi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTestDemo {
    public static void main(String[] args) {
        //创建线程池对象
        //包含两个线程池对象
        ExecutorService  service = Executors.newFixedThreadPool(2);
        ThreadPollTest  r  = new ThreadPollTest();
        service.submit(r);
        service.submit(r);
        service.submit(r);
    }
}
