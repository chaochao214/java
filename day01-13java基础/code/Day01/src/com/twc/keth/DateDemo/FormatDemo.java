package com.twc.keth.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 创建代表当前时间的date对象
        //格式化
        Date d = new Date();
        String s =sdf.format(d);
        System.out.println(s);
        //解析，date  parse（String s) 方法 : 将传入的字符串。
        //创建的字符串，对应构造中的模式
        String s2 ="2008/08/08 20:00:00";
        //2 解析。方法中有异常出现，编译中异常，
        //  解决方式 alt enter_>enter
        Date olympicDay  =  sdf.parse(s2);
        System.out.println(olympicDay);
    }

}
