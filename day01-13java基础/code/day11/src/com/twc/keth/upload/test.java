package com.twc.keth.upload;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd日HH_mm_ss");
        String s =  sdf.format(new Date());
        System.out.println(s);
    }
}
