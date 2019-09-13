package com.twc.jlyi;

public class BaoZiPu extends Thread {
    private Baozi bz;

    public BaoZiPu(String name, Baozi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count  = 0;
        //造包子
        while(true){
            synchronized(bz){
                if(bz.flag == true ){
                    try {
                        bz.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺开始做包子");
                if(count%2==0){
                    bz.pi = "冰皮";
                    bz.xian="五仁";
                }else{
                    bz.pi= " 薄皮";
                    bz.xian= "牛肉大葱";
                }
                count++;
                bz.flag = true;
                System.out.println("包子造好了"+ bz.pi+ bz.xian);
                System.out.println("吃货来吃");
                bz.notify();

            }
        }
    }
}
