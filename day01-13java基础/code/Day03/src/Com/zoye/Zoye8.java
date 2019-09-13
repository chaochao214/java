package Com.zoye;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Zoye8 {
    public static void main(String[] args) {
        LinkedHashSet<String>  lhSet =new LinkedHashSet<>();
        lhSet.add("name1");
        lhSet.add("name2");
        lhSet.add("name3");
        lhSet.add("name4");
        System.out.println(lhSet);

        Iterator<String> iterator  = lhSet.iterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next() );
        }
    }
}
