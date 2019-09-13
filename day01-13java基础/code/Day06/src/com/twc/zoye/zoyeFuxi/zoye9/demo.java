package com.twc.zoye.zoyeFuxi.zoye9;

public class demo {
    private static int crossNum = 0;

    public static void main(String[] args) {
        //不知道该怎么处理
            Runnable rb = new Runnable() {
            private final Object lock = "lock";

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // sout 出不来这个代码
                System.out.println(Thread.currentThread().getName() + "正在通过，通过的时间顺序是" + crossNum);
                crossNum++;
            }
        };

        Thread t1 = new Thread(rb);
        t1.start();
        Thread t2 = new Thread(rb);
        t2.start();
        Thread t3 = new Thread(rb);
        t3.start();
        Thread t4 = new Thread(rb);
        t4.start();


    }


}
