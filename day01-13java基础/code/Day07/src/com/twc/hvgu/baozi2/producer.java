package com.twc.hvgu.baozi2;

public class producer extends  Thread{
    private baozi baozi;

    public producer(com.twc.hvgu.baozi2.baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
         while(true){
             synchronized (baozi){
                 if(baozi.isHaveBaozi){

                     try {
                         baozi.wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }

                 }
                 //此时没有包子了，要开始做包子
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println( "包子店做包子");
                 baozi.isHaveBaozi = true;
                 baozi.notify();
             }
         }
    }
}
