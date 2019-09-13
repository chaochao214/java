package com.twc.Zoye;

public class kovj2 {
    public static void main(String[] args) {
       // System.out.println(getFibonacci(5));
        int sum  =zoye3(1);
        System.out.println(sum);
    }
    public static int getFibonacci(int n){
        if (n==1) return 1;
        if (n==2) return 1;
        return  getFibonacci(n-1)+getFibonacci(n-2);
    }
    /*          sn /2 -1 = sn-1
                2((sn-1)+1) =sn
        10   9   8
         1   4  10
     */
    public static int zoye3(int n){
        if(n==10) return 1;
        return 2*zoye3(n+1) +2;
    }


}
