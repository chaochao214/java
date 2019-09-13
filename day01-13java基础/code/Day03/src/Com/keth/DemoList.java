package Com.keth;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add(1,"王霜");
                            //对原有元素进行修改
        list.set(2,"潘晓婷");
        System.out.println(list);
    }
    public static void  demo2(){
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(100);

        list.remove(1);
        list.remove((Integer)100);
        //数据结构的一些问题


    }


}
