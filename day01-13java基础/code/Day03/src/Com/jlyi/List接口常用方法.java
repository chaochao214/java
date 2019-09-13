package Com.jlyi;

import java.util.ArrayList;
import java.util.List;

public class List接口常用方法 {
    public static void main(String[] args) {
        List<String> list   = new ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        System.out.println(list);
        list.add(1,"name0");
        System.out.println(list);
    }


}
