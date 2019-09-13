package com.twc.jlyi.线程安全;

public class 卖票  implements Runnable {
    private int tickets =100;
    String  lock = "aa";
    @Override
    public void run() {
        //每个窗口的卖票操作
        synchronized (lock){
            while(true){
                if(tickets>0){
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name =  Thread.currentThread().getName();
                    System.out.println(name+"正在卖"+tickets--);

                }
            }
        }

    }

}
