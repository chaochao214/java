package Com.keth.kethfuxi;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        list.add("list");
        Collections.addAll(list,"a","b","c");
        Collections.sort(list);

    }
}
