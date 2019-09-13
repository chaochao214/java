package com.twc.zoye;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class kovj2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("Day9\\kovj2.txt");
       while(true){
           System.out.println("请输入学生信息 格式为 学生-学生名字");
           String  s = sc.nextLine();
           if(s.equals("end")){
               break;
           }
           if(s.contains("-")){
               String[]  s2 = s.split(s);
               for(String s3:s2){
                   fw.write(s3);

               }
               fw.write(System.lineSeparator());

           }else{
               System.out.println("请按照格式输入信息");
           }

       }


    }
}
