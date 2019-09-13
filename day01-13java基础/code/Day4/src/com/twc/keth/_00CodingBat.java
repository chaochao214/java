package com.twc.keth;

public class _00CodingBat {
    public static void main(String[] args) {

    }
    public boolean gHappy(String str){
        for (int i = 0; i < str.length(); i++) {
            if('g'== str.charAt(0) && 'g' !=str.charAt(1) || 'g'== str.charAt(str.length()) && 'g' !=str.charAt(str.length()-1)){
                return  false;
            }
            if('g'==str.charAt(i)){
                if( i>0 &&'g'!=str.charAt(i+1) && 'g'!= str.charAt(i-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
