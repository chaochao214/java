package com.twc.digv;

public class DigvSum {
    public static void main(String[] args) {
       int sum = getSum(5);
        System.out.println(sum);
    }

    private static int getSum(int i) {
        if(i==1){
            return 1;
        }
        return  i+getSum(i-1);


    }
}
