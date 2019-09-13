package com.twc.Zoy;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("水立方");
        coll.add("东方明珠");
        coll.add("大雁塔");
        for (String s : coll) {
            System.out.print(s+", ");
        }
    }
}
