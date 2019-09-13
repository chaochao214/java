package com.twc.zoye;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kovj3 {
    public static void main(String[] args) throws IOException {
        List<Student>  list =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        FileWriter  fw = new FileWriter("Day9\\kovj3.txt");
        int count =0;
        while(count<3){
            System.out.println("请输入学生的信息。请不要输入空格，格式：学号，姓名,性别，年龄");
            String str = sc.nextLine();

            String[] s  =  str.split(",");
            for (String s1 : s) {
                System.out.print(s1+" ");
            }
            if(s.length!= 4){

                System.out.println( "输入格式错误，请重新输入");
                continue;
            }
        //?输入失败
            fw.write(str);
            fw.write(System.lineSeparator());
            Student stu = new Student(s[0],s[1],s[2],s[3]);
            list.add(stu);
            count++;
        }
        System.out.println();
        System.out.println(list);
        fw.close();

    }


}
