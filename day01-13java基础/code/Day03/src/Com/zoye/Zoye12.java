package Com.zoye;

import java.util.*;

public class Zoye12 {
    public static void main(String[] args) {
        Random r  = new Random();
        HashSet<Integer> hs = new HashSet<>();
        LinkedList<Integer> ls = new LinkedList<>();
        while(hs.size()<6){
            hs.add( r.nextInt(16)+1);
        }
        int  l =  r.nextInt(16)+1;


        for (Integer i : hs) {
            //???hashset怎么排序
            ls.add(i);
            System.out.println( i);
        }
       /* Collections.sort(hs, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });*/
     //    Collections.sort(ls);
        ls.add(16);
        System.out.println(ls);
    }
}
