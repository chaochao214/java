package _01_3java基础40_60;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock 可以完成synchronized的所有功能
 * <p>
 * lock有比synchronized 更精确的线程定义和更好的性能，synchronized 会自动
 * 释放锁，Lock一定邀请手工释放，并且在finall 从句中释放，lock还有更强大的功能
 */
public class _54synchronized和lock的区别 {

}


class ThreadTest {
    private int j;
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        for(int i =0 ;i<2;i++){
        //    new Thread(tt.new Adder()).start();
        //    new Thread(tt.new Subtractor()).start();
        }

    }
}
class Substractor implements Runnable{

    @Override
    public void run() {
    while (true){
        // lock这里会报错怎么处理？
       /* lock.lock();
        try{
            System.out.println("j=="+ j--);
        }finally {
            lock.unlock();
        }*/


    }
    }
}

class Adder implements Runnable {

    @Override
    public void run() {
       /* while (true) {
        //    lock.lock();
        }
        try {
            System.out.println("j--" + j--);
        } finally {
         //   lock.unlock();
        }*/
    }}

