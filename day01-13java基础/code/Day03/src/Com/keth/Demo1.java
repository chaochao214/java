package Com.keth;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list  =  new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("黄帆");
        list.add("twc");
        list.add("twc");
        System.out.println(list);
    // 方法 1
        for(int i =0; i< list.size();i++){
            String s = list.get(i );
            if(s.equals("java")){
                list.remove("java");
                i--;
            }
        }
   // 方法2
        while(list.contains("java")){
            list.remove("java");
        }
    // 方法3
        Iterator<String> it  = list.iterator();
        while(it.hasNext()){
            String s  = it.next();
            if(s.equals("twc")){
                it.remove();
            }
        }
    //


        System.out.println(list);
    }
}
