package com.twc.Suuu;

public class SuuuWang2 {

    public static void main(String[] args) {
       for(int i =1 ;i<100;i++){
           if(isPrime(i)== true){
               System.out.println(i);
           }
       }
    }

    public static boolean isPrime(int a ){
        int count = 0;
        for(int i =1 ; i <= a; i++ ){
            if(a%i  == 0){
                count ++;
            }
        }
        if(count ==2 ){
            return  true;
        }else {
            return false;
        }

    }
}

