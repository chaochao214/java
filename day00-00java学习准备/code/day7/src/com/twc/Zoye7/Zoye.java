package com.twc.Zoye7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zoye {
    public static void main(String[] args) {
        // zoye3();
        //zoye4();
        //zoye5();
        Zoye6  z6 = new Zoye6();
        System.out.println(z6.test());

        /*Zoye8 a = new Zoye8();
        a.test();*/
        //
        /*Zoye7 zoye7 =  new Zoye7();
        zoye7.test();
*/
    }


    public static void zoye1() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);

    }

    public static void zoye2() {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("twc");
        strs.add("def");
        strs.add("11");
        System.out.println(strs);
        strs.remove("def");
        System.out.println(strs);

    }

    public static void zoye3() {

        ArrayList<Worker> alw1 = new ArrayList<>();
        alw1.add(new Worker("凤姐", 18, 20000));
        alw1.add(new Worker("刘德华", 40, 90000));
        alw1.add(new Worker("欧阳峰", 60, 8000));
        System.out.println("删除前的名单" + alw1);
        for (int i = 0; i < alw1.size(); i++) {
            if (alw1.get(i).getName().equals("刘德华")) {

                alw1.remove(i);
            }
            ;

        }
        for (int i = 0; i < alw1.size(); i++) {
            System.out.println(alw1.get(i).toString());
        }

    }

    public static void zoye4() {

        int count = 3;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入账号");
            String userName = sc.next();
            System.out.println("请输入密码");
            String passWord = sc.next();
//userName=="admin" && passWord == "admin"
            if (userName.equals("admin") && passWord.equals("admin")) {
                System.out.println("登录成功");
            } else {
                count--;
                System.out.println("还有" + count + "次登录机会");
            }
            if (count == 0) {
                System.out.println("三次错误");
                break;
            }
        }
    }

    public static void zoye5() {
        Random rd = new Random();
        int num = rd.nextInt(10);
        num += 50;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("猜一个50到60之间的数字");
            int guessNum = sc.nextInt();
            if (num == guessNum) {
                System.out.println("猜对了");
                break;
            }
            System.out.println("猜错了");
        }


    }



}
