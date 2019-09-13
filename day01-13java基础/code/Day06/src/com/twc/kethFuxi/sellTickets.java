package com.twc.kethFuxi;

public class sellTickets implements  Runnable{
     int tickets = 100;
    @Override
    public void run() {
        while(true){

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
// 锁只能锁唯一对象，int 是基本数据类型， int 不是对象，所以无法加锁。
            synchronized((Integer)tickets){
                if(tickets<0){
                    break;
                }
                String name = Thread.currentThread().getName();
                System.out.println( name+"正在卖的票数为"+tickets);
                tickets--;
            }
        }
    }
}
