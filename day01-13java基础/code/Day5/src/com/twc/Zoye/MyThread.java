package com.twc.Zoye;

public class MyThread extends  Thread {
    @Override
    public void run() {
         for(int i= 1;i<=100;i++){
             if(i%2 == 0){
                 System.out.println( "子线程打印偶数"+i);
             }
         }
    }
}
