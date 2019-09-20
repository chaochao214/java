package com.twc.Demo1;

public class Demo09_2 {

    public  boolean IsPalindrome(int x){
        if(x<0 || (x%10 ==0  && x!=0 )){
            return false;
        }
        int reverseNum = 0;
        while (reverseNum<x){
            reverseNum = reverseNum*10  + x%10;
            x=x/10;
        }
        return (reverseNum == x ) || (reverseNum/10== x );
    }

}
