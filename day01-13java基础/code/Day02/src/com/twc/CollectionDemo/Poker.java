package com.twc.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //准备牌操作。
        // 牌盒
        ArrayList<String> pokerBox = new ArrayList<String>();
        //花色集合
        ArrayList<String> colors = new ArrayList<String>();
        //创建数字集合
        ArrayList<String> numbers = new ArrayList<String>();

        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        // 创造牌 拼接牌操作
        //拿出每一个花色。 然后跟每一个数字进行结合，存储在牌中
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("小☺");
        pokerBox.add("大☠");
        //System.out.print(pokerBox);
        // ??? API 中查不到 shuffle
        Collections.shuffle(pokerBox);

        ArrayList<String> play1 = new ArrayList<String>();
        ArrayList<String> play2 = new ArrayList<String>();
        ArrayList<String> play3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);

            //留出三张底牌 存到 底牌集合中
            if (i >= 51) {//存到底牌集合中
                dipai.add(card);
            } else {
                //玩家1   %3  ==0
                if (i % 3 == 0) {
                    play1.add(card);
                } else if (i % 3 == 1) {//玩家2
                    play2.add(card);
                } else {//玩家3
                    play3.add(card);
                }
            }


        }
        System.out.print("玩家1" + play1);
        System.out.println();
        System.out.print("玩家2" + play2);
        System.out.println();
        System.out.print("玩家3" + play3);
        System.out.println();
        System.out.print("底牌" + dipai);

    }
}
