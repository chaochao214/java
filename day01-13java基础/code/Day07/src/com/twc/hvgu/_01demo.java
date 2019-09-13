package com.twc.hvgu;


public class _01demo  extends  Thread{
    //一个类中。需要另外一个类的对象
    //将这个类当做成员变量， 使用构造方法赋值
    private BaoZi baozi;

    public _01demo() {
    }

    public _01demo(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
       while( true){
           synchronized (baozi){
               if(baozi.isHaveBaozi){
                   try {
                       baozi.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

               System.out.println( "消费者正在吃包子");
               try {
                   Thread.sleep(1000);
                   System.out.println("包子吃完了，包子铺可以作了");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               baozi.isHaveBaozi =   false;
               baozi.notify();
           }
       }
    }
}