package com.twc.Zoy;

import java.util.ArrayList;
import java.util.Collection;

public class Zoye3_3 {
    public static void main(String[] args) {

    }
 public static Collection<Integer> toColl(int[] a){
      Collection<Integer> coll = new ArrayList<Integer>();
     for (int i : a) {
         ((ArrayList<Integer>) coll).add((Integer)i);
     }
     return coll;

 }

}
