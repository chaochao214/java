package com.twc.Demo43;

import java.util.ArrayList;
import java.util.List;
public class GetEvenNum {
    // 获取某集合中所有的偶数
    public static List<Integer> getEvenNum(List<Integer> list){
        //创建保存偶数的集合
        ArrayList<Integer> evenList = new ArrayList<>();
        //遍历集合，添加偶数的集合
        for(int i= 0; i<list.size();i++){
            Integer integer  = list.get(i);
            if(integer % 2 ==0){
                evenList.add(integer);
            }
        }
        return evenList;
    }
}
