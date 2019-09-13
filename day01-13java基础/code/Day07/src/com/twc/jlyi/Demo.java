package com.twc.jlyi;

public class Demo {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        Chiho ch = new Chiho("吃货",bz);
        BaoZiPu bzp  = new BaoZiPu("包子铺",bz);

        ch.start();
        bzp.start();

    }
}
