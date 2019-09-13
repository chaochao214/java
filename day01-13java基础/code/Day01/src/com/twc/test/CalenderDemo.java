package com.twc.test;

import java.util.Calendar;

public class CalenderDemo {

    public static void main(String[] args) {
        //创建calendar对象
        Calendar cal =Calendar.getInstance();
        //cal设置年
        int year  = cal.get(Calendar.YEAR);
        int month =cal.get(Calendar.MONTH)+1;
        System.out.println(year);
        System.out.println(month);
    }

}
