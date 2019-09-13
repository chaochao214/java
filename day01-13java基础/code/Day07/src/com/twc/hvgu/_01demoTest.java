package com.twc.hvgu;

public class _01demoTest {
    public static void main(String[] args) {
        BaoZi bz  = new BaoZi();
        _01demo d1 = new _01demo(bz);
        Producer  p  = new Producer(bz);
        d1.start();
        p.start();

    }
}
