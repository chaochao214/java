package com.twc.zoye.zoyeFuxi.卖票;

public class SoldTic implements Runnable {
    private int tickets = 0;

    @Override
    public void run() {
        while (tickets < 100) {
            sold();
        }

    }

    public synchronized void sold() {

       /* while(tickets<101){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets ++;
            System.out.println(Thread.currentThread().getName()
        +"卖出了第"+tickets);

        }*/

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tickets++;
        System.out.println(Thread.currentThread().getName() + "卖出了第：" + tickets);
    }
}
