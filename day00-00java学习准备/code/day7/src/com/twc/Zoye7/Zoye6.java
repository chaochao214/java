package com.twc.Zoye7;

import java.util.Scanner;

public class Zoye6 {
        public int  test(){
            Scanner sc = new Scanner(System.in);
            String s= "";
            int arc;
            int count =0;
            while (true) {
                System.out.println("请输入要提交的字符串");
                s = sc.next();
                for (int i = 0; i < s.length(); i++) {
                    arc = s.charAt(i);
                    //判断是否存在字母
                    if (arc >= 97 && arc <= 122 || arc >= 65 && arc <= 90) {
                        if(arc>=65 && arc<=90){
                            count++;
                        }
                    }
                }
                if(count==0){
                    System.out.println("字符串中必须含有字母");
                }
                if (count>0){
                    return count;
                }
            }
    }
}
