package com.twc.Keth.InterfaceDemo2;

public interface liveAble {
    //定义抽象方法
    public abstract void eat();
    public abstract void sleep();
    public default void fly(){
        System.out.println("liveAble天上飞");
    }
    public  static void run(){
        System.out.println("跑起来");
    }
    default void func(){
        func1();
        func2();
    }
    private void func1(){
        System.out.println("第一个跑起来");
    }

    private void func2(){
        System.out.println("第二个跑起来");
    }


}
