package com.twc.kethFuxi.fuxi2;

public class sellTickets  extends  Thread{
    int tickets  = 100;

    @Override
    public void run() {
        while(true){
            //??? 锁对象为什么不能是tickets
            synchronized (sellTickets.class){
                if(tickets<0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"卖"+tickets);
            tickets --;
            }
        }

    }
}
