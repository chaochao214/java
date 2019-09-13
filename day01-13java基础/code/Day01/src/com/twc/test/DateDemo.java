package com.twc.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sd = new SimpleDateFormat("YYYY年MM月dd日");
        String str = sd.format(date);
        System.out.println(str);

        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = "2018年12月11日";

        try {
            Date date2 = df.parse(str2);
            int a = 1/0;
        } catch (Exception e) {
            System.out.println("报错");
        }
        System.out.println(str2);


    }

}
