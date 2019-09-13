package com.twc.Zoy;

import java.util.ArrayList;
import java.util.Collections;

public class Zoye3 {
    public static void main(String[] args){
        int[] a ={1,3,4,5};
        ArrayList<Integer> list = convertToCollection(a);
        int[] list2 = convertToArray(list);
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }


    }

    public static ArrayList<Integer> convertToCollection(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            list.add(i);
        }
        return list;
    }
    public static int[]  convertToArray(ArrayList<Integer>  a){
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        return arr;
    }
    public boolean listTest(ArrayList<String> al,String s){
        if(al.contains(s)){
            return true;
        }
        return false;
    }
    //zoye8
    public static int  listTest(ArrayList<Integer> al,Integer s){
        int count =0;
        for(Integer i:al){
            count++;
            if(i == s){
                return count;

            }
        }
        return -1;
    }

}
