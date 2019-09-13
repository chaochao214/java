package com.twc.zoye;

import java.util.function.Predicate;

public class zoye1 {
    public static void main(String[] args) {
        Integer[] arr = {11, -1, 2, -22};
        Predicate<Integer> p  = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>0;
            }
        };
        //第一部分内容
        Predicate<Integer> p1= s->s>0;
        Predicate<Integer> p2= s-> Math.abs(s)>0;
        Predicate<Integer> p3 =s-> s%2==0;
       //遍历arr,使用创建的arr 对象。
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for(Integer i: arr){
            if(p1.test(i)){
                count1++;
            }
            if(p1.negate().test(i)){
                count2++;
            }
            if(p1.negate().test(i)){
                count3++;
            }
            if(p2.and(p3).test(i)){
                count3++;
            }
        }

    }
}
