package com.twc.jlyi.FuntionalInterface03;

public class LamdaSum {
    public static void   showSum( int x, int y ,Sumble sumCalculator){
        System.out.println(sumCalculator.sum(x,y));
       // System.out.println(sumCalculator.sum(1,2));
    }

    public static void main(String[] args) {
       showSum(10,20,(m,n)->m+n);
    }

}
