package com.twc.Demo2;

public class Demo67_2 {
    public String addBinary(String a, String b) {

      int c= test(a)+test(b);
      return   null;
    }
    public int test(String s ){
        int a = 0b0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 1:a= a*2 +1;
                break;
                case 0:a= a*2;
                break;
            }
        }
        return a;

    }




}
