package Com.keth;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo03 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(17);
        set.add(16);
        System.out.println(set);
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(12);
        ts.add(10);
        System.out.println(ts);

        new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return
                        o2.compareTo(o1);
            }
        };
    }
}
