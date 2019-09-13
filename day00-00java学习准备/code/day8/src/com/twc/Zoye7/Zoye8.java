package com.twc.Zoye7;

public class Zoye8 {
    public String  test(String s1,String s2){
        if(s1.charAt(s1.length()-1)==s2.charAt(0)){
            return s1.concat(s2.substring(1,s2.length()-1));

        }
       return s1+ s2;
    }
}
