package com.twc.Demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class PokerTest {
    // 双列Map集合，HashMap集合，完成一个数字与字符串纸牌的对应关系
    /**
     *  1.洗牌，通过数字完成洗牌发牌
     * 2. 发牌，将每个人以及底牌设计为ArrayList<String>,将最
     *
     *
     *
     *
     **/
    public static void main(String[] args) {
    PokerList();

    }
    public static void  PokerList(){
        //键和值绑定
        HashMap<Integer,String> pokerBox = new HashMap<>();
        //开始编号
        int   count = 0;
        pokerBox.put(count++,"大王");
        pokerBox.put(count++, "小王");

        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> num  = new ArrayList<>();

        Collections.addAll(color,"♠","♣","♥","♦");
        Collections.addAll(num,"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //拿到花色遍历有序，从大到小
        for(String n : num){
            for(String m : color){
                pokerBox.put(count++,m+n);
            }
            }
        System.out.print(pokerBox);
        //开始分牌
        //要求用的list的集合。
        Set<Integer> keySet = pokerBox.keySet();

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.addAll(keySet);
        Collections.shuffle(numberList);


    }

}
