package com.twc.jlyi;

public class MyThread extends  Thread {
    public MyThread(String name){
        super(name);
    };
    /**
     * 重写run方法，完成该线程执行的逻辑
     */
    @Override
    public void run() {

        for(int i =0 ;i<10;i++){
            System.out.println(getName()+"正在执行"+i);
        }
    }
}
