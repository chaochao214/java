package com.twc.Suuu;

public class SuuuWang {

    public static void main(String[] args) {
     //   System.out.println(isPrime(56));

       for( int i  =1 ; i < 101 ; i++ ){
        boolean b = isPrime(i);
         //  System.out.println(b);
        if(b == true){
            System.out.print(i+"  ");
        }
        }
    }

    public static boolean isPrime(int a ) {
        //从1-a的循环
        int count = 0;
        for (int i = 1; i <= a; i++) {
            int yuShu = a % i;
            if (yuShu == 0) {

                count++;
            }

        }
        if (count == 2) {

            return true;
        } else {

            return false;
        }


    }}
