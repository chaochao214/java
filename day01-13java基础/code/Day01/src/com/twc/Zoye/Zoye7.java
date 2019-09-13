package com.twc.Zoye;

import java.util.Calendar;
//判断2018年2月14日是星期几
public class Zoye7 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.YEAR,2018);
        c1.set(Calendar.MONTH,1);
        c1.set(Calendar.DATE,14);
        int year =c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int week  =c1.get(Calendar.DAY_OF_WEEK);
        System.out.println( week);

    }


}
