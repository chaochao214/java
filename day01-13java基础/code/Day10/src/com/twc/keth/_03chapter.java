package com.twc.keth;

import java.io.*;
import java.util.ArrayList;

public class _03chapter {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        outSer();
        inSer();


    }
    public static void  outSer() throws  IOException{
        //对象输出流
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("Day10\\demo3.txt"));
        RoleHero rh =new RoleHero("name1","weapon1","40");
        RoleHero rh2 =new RoleHero("name2","weapon1","40");
        RoleHero rh3 =new RoleHero("name3","weapon1","40");
        ArrayList<RoleHero> al = new ArrayList<>();
        al.add(rh);
        al.add(rh2);
        al.add(rh3);
        oos.writeObject(al);

        oos.close();
    }
    public static void inSer() throws IOException, ClassNotFoundException {
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("Day10\\demo3.txt"));
        ArrayList<RoleHero> al = (ArrayList<RoleHero>) ois.readObject();
        for (RoleHero role : al) {
            System.out.println(role);

        }
        ois.close();
    }

}
