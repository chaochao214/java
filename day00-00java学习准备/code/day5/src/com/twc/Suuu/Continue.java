package com.twc.Suuu;

public class Continue {
    public static void main(String[] args) {
        for(int i= 1;i<= 10 ;i++){
            if(i==3){
                break;
            }
            System.out.println("输出数字"+i);

        }
        System.out.println("-------------------");
        for(int i=1 ;i<= 10;i++){
            if(i ==3){
                continue;
            }
            System.out.println("输出数子"+i);
        }
    }
}
