package com.twc.jlyi.线程安全.sellTickets;

public class test {
    public static void main(String[] args) {
         sellTickets st  = new sellTickets();
         Thread t1= new Thread(st,"name1");
         Thread t2= new Thread(st,"name2");
         Thread t3= new Thread(st,"name3");
         t1.start();
         t2.start();
         t3.start();
    }
}
