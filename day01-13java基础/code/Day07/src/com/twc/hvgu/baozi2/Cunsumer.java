package com.twc.hvgu.baozi2;

public class Cunsumer  extends Thread {
    private baozi baozi;

    public Cunsumer(com.twc.hvgu.baozi2.baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
    while(true){
        synchronized (baozi){
            if(!baozi.isHaveBaozi){
                try {
                    baozi.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("没有包子，消费者等待");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //有包子
           baozi.notify();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("正在吃包子");
            baozi.isHaveBaozi= false;

        }


    }

    }
}
