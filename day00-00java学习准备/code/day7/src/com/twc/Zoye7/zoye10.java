package com.twc.Zoye7;

import java.util.ArrayList;
import java.util.Scanner;

public class zoye10 {
    public static void main(String[] args) {
        isValid();
    }



    public static void  isValid(){
        Scanner sc = new Scanner(System.in);
        int[] a  = new int[5];


        for(int i=0;i<5;i++) {
            System.out.println("请输入数字"+(i+1));
            int num = sc.nextInt();
            if (num>=100 && num<=200 ){
                a[i] = num;
            }else{
                System.out.println("请输入一个100-200之间的数字");
                i--;
            }
        }
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for(int i=0;i< 5;i++){
            if(a[i]%2 == 0){
                oddList.add(a[i]);
            }
            if(a[i]%2!= 0){
                evenList.add(a[i]);
            }
        }
        System.out.println("偶数");
        for(int i = 0 ;i<oddList.size();i++){
            System.out.println(oddList.get(i));
        }
        System.out.println("奇数");
        for(int i = 0 ;i<evenList.size();i++){
            System.out.println(evenList.get(i));
        }
    }

}
