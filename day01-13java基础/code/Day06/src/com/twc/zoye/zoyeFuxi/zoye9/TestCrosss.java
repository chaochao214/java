package com.twc.zoye.zoyeFuxi.zoye9;

public class TestCrosss {
    public static void main(String[] args) {
        Tunnel tul = new Tunnel();
        for (int i = 0; i < 10; i++) {
        new Thread(tul).start();
        }

    }
}
