package com.twc.jlyi.线程;

public class test {
    public static void main(String[] args) {
        //
        /*MyThread mt  = new MyThread();
        mt.run();*/
        MyRunnable mr  = new MyRunnable();

        mr.run();
    }


}
