package Com.twc;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> list  = new ArrayList<String>();
        list.add("没头脑");
        list.add("不高兴");
        list.add("一个鸡蛋");
        System.out.println(list);
        list.add(1,"测试");
        System.out.println(list);
    }
}
