package Com.zoye;

import java.util.ArrayList;
import java.util.List;

public class Zoye7 {
    public static void main(String[] args) {
        List<String> list   = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        for (int i = 0; i < list.size(); i++) {
                if("李四".equals(list.get(i))){
                    list.set(i,"李小四");
                }

        }
        System.out.println(list );
    }


}
