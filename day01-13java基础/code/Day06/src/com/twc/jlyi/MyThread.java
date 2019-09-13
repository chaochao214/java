package com.twc.jlyi;

public class MyThread  extends  Thread{
    /**
     *  利用继承中的特点
     *
     *
     */
    public  MyThread(String  name){
        super(name);
    }
    /*
     重写run方法
     定义线程要执行的代码
     */

    @Override
    public void run() {
        for(int i=0 ;i< 20;i++){
            System.out.println( getName()+i);
        }

    }
}
