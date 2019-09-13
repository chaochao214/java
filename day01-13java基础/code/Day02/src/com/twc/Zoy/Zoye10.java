package com.twc.Zoy;

import java.util.ArrayList;
import java.util.Random;

public class Zoye10 {
    public static void main(String[] args) {
        int[] a  = new int[10];
        Random r = new Random();
        ArrayList<Integer> al =new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            a[i]= r.nextInt(100);
            if(a[i]>=10){
                al.add(a[i]);
            }
        }
        System.out.println(al );

    }


}
