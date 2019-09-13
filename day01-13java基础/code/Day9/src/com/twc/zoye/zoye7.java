package com.twc.zoye;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zoye7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("Day9\\zoye7.txt");
        while(true){
            System.out.println("请输入内容:");
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            fw.write(str);
            fw.write(System.lineSeparator());
        }
        fw.close();

    }
}
