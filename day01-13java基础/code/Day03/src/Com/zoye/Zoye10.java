package Com.zoye;

import java.util.ArrayList;
import java.util.List;

public class Zoye10 {
    public static void main(String[] args) {
        String[] strs = {"12345", "222", "222", "dsf"};
        List<String> list = new ArrayList<>();
        for (String s : strs) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        System.out.println(list);
    }
}
