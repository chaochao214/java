package com.twc.java.Functional_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class doublingH {
    public static void main(String[] args) {
       /* String s= "abc";
        String[] s2 =s.split("b");
        System.out.println(s2.toString());
        System.out.println("a");*/
        List<String> ax = new ArrayList<>();
        ax.add("ax");
        ax.add("bb");
        ax.add("cx");
        List<String> strings = noX(ax);
        System.out.println(strings);

    }
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n*2);
        return nums;
    }
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n-> n*n);
        return nums;
    }
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n-> n+"*");
        return strings;
    }
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n->n+n+n);
        return strings;
    }
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n->"y"+n+"y");
        return strings;
    }
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n->10*(n+1));
        return nums;
    }
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n->n%10);
        return nums;
    }
    public List<String> lower(List<String> strings) {
        strings.replaceAll(n->n.toLowerCase());
        return strings;
    }
    // lamda表达式:String类api中找不到对应的方法
    public static List<String> noX(List<String> strings1) {
        ArrayList<String> strings  = (ArrayList<String>)strings1;
       /* ArrayList<String> strings  = new ArrayList<>();
        for (String s : strings1) {
            if(s.contains("x")){
                String x = s.replaceAll("x", "");
                strings.add(x);
            }else{
                strings.add(s);
            }
        }
        return strings;*/

        /*ArrayList<String> al = new ArrayList<>();
        for (String ss : strings) {
            String s = ss.replaceAll("x","");
        }*/
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).contains("x")){
                String x = strings.get(i).replaceAll("x", "");
                strings.remove(strings.get(i));
                System.out.println(strings.get(i)+"============="+x);

                strings.add(x);
                i--;
            }
        }
        Collections.sort(strings);
        return strings;
    }

}
