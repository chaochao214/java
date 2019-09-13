package Com.jlyi;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> set =  new HashSet<>();
        set.add(new String(" cba"));
        set.add("aaa");
        set.add("ccc");
        set.add("def");
        //元素都是无序的，即存取顺序不一致
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println( set);

    }


}
