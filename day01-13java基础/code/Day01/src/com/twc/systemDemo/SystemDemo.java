package com.twc.systemDemo;

public class SystemDemo {

    public static void main(String[] args) {
       long start  = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
        }

        long end= System.currentTimeMillis();
        System.out.println("end - start一共耗时"+(end - start));
    }
}
