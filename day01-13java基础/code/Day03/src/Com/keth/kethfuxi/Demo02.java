package Com.keth.kethfuxi;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        /**
         *public static <T> boolean addAll​(Collection<? super T> c,
         *                                  T... elements)
         *
         */
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);
        Collections.addAll(list,1,2,3,4);
        System.out.println(list);
    }
}
