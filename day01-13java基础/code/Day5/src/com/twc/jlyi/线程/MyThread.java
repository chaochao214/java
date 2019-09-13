package com.twc.jlyi.线程;

public class MyThread extends Thread{
    /**
     *   利用继承中的特点，进行传递
     * */

    /*public MyThread(String name){
        super(name);
    }*/

    @Override
    public void run() {
        System.out.println( "我跑了");
    }
}
