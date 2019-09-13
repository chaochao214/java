package com.twc.Suuu;

public class IsPrime {
    public boolean isPrime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
       /*  if(count==2){
             return true;

         }*/
        }
        if (count == 2) {
            return true;
        } else {
            return false;

        }
    }
}
