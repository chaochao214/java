package com.twc.Zoye;

public class Zoye10 {
    public static void main(String[] args) {
        String[] c2={"010","3223","666","7890987","123123"};
        dvigNum(c2);


    }
    public static  void dvigNum(String[] s){
        int count  = 0;

        for(String s2: s){
            StringBuilder sb = new StringBuilder(s2);
            if(sb.reverse().toString().equals(s2)){
                count++;
            }
        }
        System.out.println(count);
    }



}
