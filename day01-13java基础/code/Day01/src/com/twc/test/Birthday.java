package com.twc.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Birthday {
    public static void main(String[] args) {

        SimpleDateFormat  sp  = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1  = new Date();

        String str  = sp.format(date1);
        System.out.println(str);

        String  birthday  = "1988年04月10日";
        //   Date d  =  sp.parse(date1);

    }
}
