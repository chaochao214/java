package com.twc.Zoye10;

import java.util.Scanner;

public class Phone implements RedRay {
    Scanner sc = new Scanner(System.in);
    @Override
    public void controlTV(TV tv) {
        System.out.println("手机开启红外线功能，控制电视");
        System.out.println("请输入电视节目信息");
        String s2 =sc.next();
        TV tv2 =  new TV();
        tv2.play(s2);
    }

    @Override
    public void connecting() {

    }
}
