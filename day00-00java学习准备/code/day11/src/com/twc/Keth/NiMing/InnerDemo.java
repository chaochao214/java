package com.twc.Keth.NiMing;

public class InnerDemo {
    public static void main(String[] args) {
        /*


         */
        FlyAble f = new FlyAble(){
            @Override
            public void fly() {
                System.out.println("我飞了");
            }


        };
        f.fly();
    }
}
