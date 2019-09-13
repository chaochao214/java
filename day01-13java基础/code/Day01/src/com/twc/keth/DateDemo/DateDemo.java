package com.twc.keth.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    /**
     *  空参构造
     *
     */
    public static void main(String[] args) throws ParseException  {
        //构造方法
        Date d = new Date();
        System.out.println(d);
        //getTime(): 获取当前的时间毫秒值
        //后台中获取时间
        //(2)DateFormat
        SimpleDateFormat sp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //其他方
        Date d2  = new Date();
        String s1 = sp.format(d2);

        SimpleDateFormat sp2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        System.out.println(sp2.format(d));
        String s2 =  "2019-03-14 19:11:01";


        System.out.println( s1);
        // 解析的时候为什么会报错
         System.out.println(sp2.parse(sp2.format(d)));
    }

}
