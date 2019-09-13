package com.twc.zoye.zoyeFuxi.zoye9;

public class Tunnel implements Runnable {
    //定义一个变量来记录通过隧道的人数
    private int crossNum = 0;


    @Override
    public void run() {

        cross();
    }

    public synchronized void cross() {
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        crossNum++;
        System.out.println(Thread.currentThread().getName() + "正在通过，通过数为：" + crossNum);
    }


}
