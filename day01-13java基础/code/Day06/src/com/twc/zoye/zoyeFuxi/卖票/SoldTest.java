package com.twc.zoye.zoyeFuxi.卖票;

public class SoldTest {

    public static void main(String[] args) {
        SoldTic  st = new SoldTic();
        for (int i = 0; i < 4; i++) {
            new Thread(st).start();
            System.out.println("线程"+i+"被创建");
        }
    }
}
