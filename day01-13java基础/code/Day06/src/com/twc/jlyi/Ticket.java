package com.twc.jlyi;

public class Ticket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        //run选，重写 。 每个窗口的操作 。 窗口每天开启
        while (true) {
            //?？？？卖票出现票号为负的情况
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //获取当前对象的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖" + ticket--);
        }

    }
}
