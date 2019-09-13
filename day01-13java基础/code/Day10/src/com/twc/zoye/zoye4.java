package com.twc.zoye;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class zoye4  {
    public static void main(String[] args) throws Exception{

        write();
        verify();
    }
    public static void verify() throws Exception{
        FileReader  fr  = new FileReader("Day10\\zoye4.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> al =  new ArrayList<>();
        String  r = null;
        while((r= br.readLine())!= null){
            System.out.println( r);
            al.add( r);
        }
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入验证吗");
            String s = sc.nextLine();
            if(al.contains(s)){
                System.out.println("验证通过");
                break;
            }
            System.out.println("验证码输入错误，请重新输入");
        }

        br.close();
    }

    public static void write() throws Exception{

        FileWriter fw = new FileWriter("Day10\\zoye4.txt");
     //   BufferedWriter  bw  = new BufferedWriter(new Filec);
        BufferedWriter bw  =new BufferedWriter(fw);
        Scanner sc =new Scanner(System.in);
        int count =0;
        while(count<3){

            System.out.println("输入验证吗");
            String s = sc.nextLine();
            if(s!=null){
                bw.write(s);
                bw.newLine();
                count++;
            }
        }

        bw.close();



    }
}
