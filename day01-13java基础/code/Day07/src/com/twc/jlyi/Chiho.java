package com.twc.jlyi;

public class Chiho extends Thread {
    private Baozi bz;

    public Chiho(String name, Baozi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag==false){//没包子
                    try{
                        bz.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                //吃货正在吃包子
                System.out.println(bz.pi+ bz.xian);
                bz.flag =  false;
                bz.notify();
            }
        }
    }
}
