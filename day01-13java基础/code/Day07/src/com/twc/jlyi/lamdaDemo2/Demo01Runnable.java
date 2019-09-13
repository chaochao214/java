package com.twc.jlyi.lamdaDemo2;

public class Demo01Runnable {
    public static void main(String[] args) {
        // 匿名内部类
        Runnable  task = new Runnable() {
            @Override
            public void run() { //重写覆盖抽象方法
                System.out.println("多线程任务执行");
            }
        };

    }
}
