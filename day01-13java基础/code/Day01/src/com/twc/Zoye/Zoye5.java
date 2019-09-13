package com.twc.Zoye;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zoye5 {
    public static void main(String[] args) {
        Date d1 = new Date();
        SimpleDateFormat df  = new SimpleDateFormat("yyyy-MM-day hh:mm:ss");
        String  nowTime =df.format(d1);
        System.out.println(nowTime);


    }



}
