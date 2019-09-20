package com.i00_基础题目搜集._05写一个死锁程序;

/**
 * 简单死锁程序：
 * lockA，lockB 分别是两个资源，线程a,b必须是同事拿到才能工作
 * 但a线程先拿locka,再拿lockB
 * 线程b先拿lockb, 再拿lockA
 */
public class demo {
    public static void main(String[] args) {
        Object lockA =  new Object();
        Object lockB =  new Object();
        A a =  new A(lockA,lockB);
        B b =  new B(lockA,lockB);
        //怎么看出来这是一个死锁程序？

        a.start();
        b.start();
    }

    static class A extends Thread {
        /**
         * 为什么一定要有构造器?/  final的值一般是指定的，如果
         * 这里没有指定具体数值，一定要通过构造器传入数值
         */

        private final Object lockA;
        private final Object lockB;

        A(Object lockA, Object lockB) {
            this.lockA = lockA;
            this.lockB = lockB;
        }

        @Override
        public void run() {
            synchronized (lockA) {
                try {
                    Thread.sleep(1000);
                    synchronized (lockB){
                        System.out.println("hello A");
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    static class B extends  Thread{
        private final Object lockA;
        private final Object lockB;

        public B(Object lockA, Object lockB) {
            this.lockA = lockA;
            this.lockB = lockB;
        }

        @Override
        public void run() {
            synchronized (lockB){
                try {
                    Thread.sleep(1000);
                    synchronized (lockA){
                        System.out.println("b执行了");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
