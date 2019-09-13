package com.twc.zoye;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class kovj4{
    public static void main(String[] args) throws  Exception {
      /* ArrayList<String> al = new ArrayList<>();
       al.add("ac");
       al.add("bc");
       al.add("dc");
        System.out.println(al+"转换前");
       Collections.reverse(al);
        System.out.println( al);*/
      write(read());


    }
    public static ArrayList<String>  read() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("Day10\\kovj4.txt"));
        ArrayList<String> list  = new ArrayList<>();
      /*  int a= -1;
        while((a=fis.read(b))!=-1){
            list.add(new String(b,0,a));
        }*/
        String line;
        while((line= br.readLine())!=null){
            list.add(line);
        }
        System.out.println(list);
        br.close();
        return list;
    }
    public static void  write(ArrayList<String> list) throws Exception{
        Collections.reverse(list);
        System.out.println( list);
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("Day10\\kovj4.txt"));
        for (String s : list) {
            bw.write(s.getBytes());
        }

        bw.close();
    }
}
