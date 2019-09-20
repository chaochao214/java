package com.i00_基础题目搜集._04生产者消费者问题;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 阻塞队列实现消费者-生产者
 */
public class demo {
    public static void main(String[] args) {
        final BlockingQueue<Integer>  list = new ArrayBlockingQueue<>(10);
        Produce produce = new Produce(list);
        Consumer consumer   = new Consumer(list);
        produce.start();
        consumer.start();


    }

    static class Consumer extends Thread {
        //阻塞队列为什么一定要加构造器
        private final BlockingQueue<Integer> list;

        Consumer(BlockingQueue<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Integer take = list.take();
                    System.out.println("消费数据" + take);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Produce extends Thread {
        private final BlockingQueue<Integer> list;

        Produce(BlockingQueue<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    int i = new Random().nextInt(100);
                    list.put(i);
                    System.out.println("生产数据");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
