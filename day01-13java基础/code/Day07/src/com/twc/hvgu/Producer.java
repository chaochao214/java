package com.twc.hvgu;


public class Producer extends Thread {
    private BaoZi baozi;

    public Producer(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baozi) {
                if (baozi.isHaveBaozi) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有包子
                System.out.println("正在生产包子....");
                try {
                    Thread.sleep(2000);
                    System.out.println("包子做好了，可以吃了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baozi.isHaveBaozi = true;

                baozi.notify();
            }
        }


    }
}
