package com.twc.Zoye7;

import java.util.ArrayList;

public class Zoye9 {

    public void test(String[] str) {
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < str[i].length(); j++) {
                if ((int) str[i].charAt(j) >= 48 && (int) str[i].charAt(j) <= 57) {

                    break;
                }
                al.add(str[i]);
                break;
            }
        }
        for(int i =0 ;i< al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
