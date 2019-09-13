package com.itheima.HongBao4;

import java.util.ArrayList;

public class CoWu {

    public static void main(String[] args) {
        double a = 100.0;
        //  a= a*100;
        double b = a / 7;

        System.out.println(b);
        char[] c = Double.toString(b).toCharArray();

        for(char cha:c){
            System.out.print(cha);
        }

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {

            if (i > 2 && c[i - 3] != '.'  || i==0 || i==1 ) {
                list.add(c[i]);
            }else{
                break;
            }

        }
        System.out.println(list.toString());

    }
}
