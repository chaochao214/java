package com.twc.Zoye7;

import java.util.Scanner;

public class Zoye8 {
    public static void main(String[] args) {
       // test();
    }



    public  void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String s = sc.next();
        int yinwen = 0;
        int num = 0;
        int others = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            if (a >= 97 && a <= 122 || a >= 65 && a <= 90) {
                yinwen++;
            } else if (a >= 48 && a <= 57) {
                num++;
            } else {
                others++;
            }

        }
        System.out.println("英文字符"+yinwen);
        System.out.println("数字字符"+num);
        System.out.println("其他"+others);

    }


}
