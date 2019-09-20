package com.twc.Demo1;

import java.util.HashSet;
import java.util.Set;

public class Demo03_02_02 {
    public static void main(String[] args) {
        String s= "abcabcbb";
        int maxLen =0;
        for(int i = 0; i<s.length();i++){
            for(int j= 0; j<i;j++){
                if(allUnique(s,j, i)){
                  maxLen= maxLen>(i-j)?maxLen:i-j;
                };
            }
        }
        System.out.println(maxLen);
    }

    public static boolean allUnique(String s, int start, int end){
        Set<Character>  chaS = new HashSet<>();
        for( int i = start;i<end;i++  ){
            if(chaS.contains(s.charAt(i))){

                return false;

            }
            chaS.add(s.charAt(i));
        }

        return true;

    }

}
