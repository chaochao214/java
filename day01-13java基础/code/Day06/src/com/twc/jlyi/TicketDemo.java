package com.twc.jlyi;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket ticket  = new Ticket(); //搞一个接口实现类对象，给所有线程共享的
        //创建三个窗口对象
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");
        //同时卖票
        t1.start();
        t2.start();
        t3.start();

    }
}
