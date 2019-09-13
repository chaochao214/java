package com.twc.ArrayListDemo;

import java.util.ArrayList;

public class RandomDemo {
    public static void main(String[] args) {
        // 创建random 对象
        RandomDemo random = new RandomDemo();
        // 创建 arraylist 对象
        ArrayList<Integer> list = new ArrayList<>();
        //添加随机数到集合
        for (int i = 0; i < 6; i++) {

            //     int r = random.nextInt(5) + 1;
            //      list.add(r);

        }
        //集合输出
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

    }



}