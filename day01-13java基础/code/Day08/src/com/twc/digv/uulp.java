package com.twc.digv;

public class uulp {
   // ???   斐波那契 数列，兔子问题

    public static void main(String[] args) {
        System.out.println(f(8));
    }
    public static int f(int n){
        if(n==1||n ==2){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
}
