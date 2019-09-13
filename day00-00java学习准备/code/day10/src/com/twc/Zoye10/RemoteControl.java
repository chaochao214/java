package com.twc.Zoye10;

import java.util.Scanner;

public class RemoteControl {
    Scanner  sc  = new Scanner(System.in);
    void controlTV(TV tv){
        System.out.println("遥控器控制电视");
        System.out.println("请输入电视节目");
        String channnelNum = sc.next();
        TV tv1  = new TV();
        tv.play(channnelNum);
    }
}
