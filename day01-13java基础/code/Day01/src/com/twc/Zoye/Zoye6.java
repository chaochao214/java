package com.twc.Zoye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
    // 2018-03-04转换为2018年03月04日
public class Zoye6 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sp = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sp2 = new SimpleDateFormat("yyyy-MM-dd");

        Date date  = sp2.parse("2018-03-04");
        System.out.println(sp.format(date));


    }
}
