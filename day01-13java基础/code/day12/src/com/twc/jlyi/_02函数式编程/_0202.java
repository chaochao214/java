package com.twc.jlyi._02函数式编程;

public class _0202 {
    public static void main(String[] args) {
        startThread(()-> System.out.println( "线程任务执行"));
    }
    private static  void startThread(Runnable task){
        new Thread(task).start();
    }
}
