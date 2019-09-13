package com.twc.zoye.zoye9;
/// ???? implements，为什么extends不能实现
public class PersonThread implements  Runnable{
    int person =10;
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (PersonThread.class){
                if(person<1) break;
                String  name = Thread.currentThread().getName();
                System.out.println(name+"正在通过山洞，他的通过顺序是"+ (11-person) );
                person --;
            }
        }
    }
}
