package Com.twc;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        //创建对象集合
        HashSet<String> set = new HashSet<String>();
        //添加元素
        set.add("bac");
        set.add("cba");
        set.add("abc");

        set.add(new String("cba"));
        set.add("abc");
        for(String a: set){
            System.out.println(a);
        }

    }

}
