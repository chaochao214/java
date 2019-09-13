package com.twc.keth.CalendarDemo;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //创建对象,表示的是当前时间
        Calendar c  = Calendar.getInstance();
        //获取年月日
        int year = c.get(Calendar.YEAR);

        // set(int field, int age) :修改指定字段的值
        //
        c.set(2008,7,8);
        System.out.println(c.get(Calendar.YEAR)+ c.get(Calendar.MONTH)+c.get(Calendar.DAY_OF_WEEK));
    }


}
