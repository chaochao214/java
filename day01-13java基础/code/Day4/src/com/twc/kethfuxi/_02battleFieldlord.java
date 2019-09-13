package com.twc.kethfuxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class _02battleFieldlord {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm = iventCard();
        ArrayList<ArrayList<Integer>> listA = new ArrayList<>();
        listA = getCard();



       /* // 测试卡牌部分没有问题。
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        show(hm, list);*/




        System.out.println(getCard().get(0));
        System.out.println(getCard().get(1));
        System.out.println(getCard().get(2));
        System.out.println(getCard().get(3));


       show(hm, listA.get(0));
        show(hm, listA.get(1));
        show(hm, listA.get(2));
        show(hm, listA.get(3));

    }

    public static HashMap<Integer, String> iventCard() {
        // 创建花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 创建点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        HashMap<Integer, String> card = new HashMap<>();
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                card.put(index, color + number);
                index++;
            }
        }

        card.put(52, "小王");
        card.put(53, "大王");
        return card;
    }

    //洗牌，发牌
    public static ArrayList<ArrayList<Integer>> getCard() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> botomCard = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            if (i % 3 == 0) {
                player1.add(list.get(i));
            }
            if (i % 3 == 1) {
                player2.add(list.get(i));
            }
            if (i % 3 == 2) {
                player3.add(list.get(i));
            }
        }
        botomCard.add(list.get(list.size() - 3));
        botomCard.add(list.get(list.size() - 2));
        botomCard.add(list.get(list.size() - 1));
        ArrayList<ArrayList<Integer>> cardBox = new ArrayList<ArrayList<Integer>>();
        cardBox.add(sort(player1));
        cardBox.add(sort(player2));
        cardBox.add(sort(player3));
        cardBox.add(sort(botomCard));
        return cardBox;
    }

    //  卡牌排序
    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return list;
    }

    //展示卡牌
    public static void show(HashMap<Integer, String> map, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(map.get(list.get(i)) + "  ");
        }
        System.out.println();
    }
}
