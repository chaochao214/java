package com.twc.ArrayListDemo;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList2 {

    public static void main(String[] args) {
        //
        Random  random = new Random();
        ArrayList<Integer>  list  = new ArrayList<Integer>();
        for(int i = 1 ; i< 10;i++){
            list.add(random.nextInt());
            System.out.println(list.get(i-1));
        }
    }
}
