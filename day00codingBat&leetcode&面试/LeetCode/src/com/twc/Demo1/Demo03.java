package com.twc.Demo1;

        import java.util.ArrayList;
        import java.util.Arrays;

public class Demo03 {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Integer>   num = new ArrayList<>();

        list.add('0');

        for (int i = 0; i < s.length(); i++) {
            System.out.println("循环开始执行_________________");
        //判断list中是否和新加入的元素重复
            for (int j = 0; j < list.size(); j++) {
                System.out.println("执行到二层循环");

                if(list.get(j)==s.charAt(i)){

                    num.add(list.size());
                    list.clear();
                    list.add('0');
                    break;
                }

                list.add(s.charAt(i));
            }
        }
        if(list.get(0)==0){
            list.remove(0);
        }

        System.out.println("list输出");
        for(Character a:list){
            System.out.println(a);
        }

        System.out.println("num输出");
        for(Integer a:num){
            System.out.println(a);
        }


        int temp = 0;
        for (int i = 0; i < num.size(); i++) {
            if(num.get(i)>temp){
                temp =num.get(i);
            }
        }
        return temp;
    }

}
