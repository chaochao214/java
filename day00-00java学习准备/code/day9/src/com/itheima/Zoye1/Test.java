package com.itheima.Zoye1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        FactoryImp fi = new FactoryImp();
        ArrayList<Hat>  list = fi.piliang(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i+"个帽子");
            fi.describe(list.get(i));

        }
    }
}
