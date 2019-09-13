package com.itheima.HongBao4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

       MemberMaster mm1 = new MemberMaster("群主",200.0);

       Member   m1 =  new Member("0",0);
       Member   m2 =  new Member("0",0);
       Member   m3 =  new Member("0",0);
       //发红包
        ArrayList<Double> list = mm1.send(100,3);
        m1.openRedPocket(list);
        m2.openRedPocket(list);
        m3.openRedPocket(list);

    }
}
