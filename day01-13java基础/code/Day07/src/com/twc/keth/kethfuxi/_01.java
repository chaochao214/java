package com.twc.keth.kethfuxi;

import java.util.Random;

/*

    有两条线程，同事加数据，每条加三个数据
 */
public class _01 {
    public static void main(String[] args) {
        new AddArray().start();
        new AddArray().start();
    }

}
class AddArray  extends  Thread{
    //数组是一个共享数据
    private static int arr[] =new int[6];
    //数组的索引是共享数据
    private  static int index =0;
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (AddArray.class){
                int nextInt = new Random().nextInt(100);
                arr[index] = nextInt;
                index++;
                System.out.println( getName()+"向数组中添加了数据"+nextInt);
        }
       ;
        }

    }
}