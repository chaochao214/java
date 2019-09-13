package Com.zoye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoye9 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>( );
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        Collections.sort(list);
        System.out.println(list);
    }
}
