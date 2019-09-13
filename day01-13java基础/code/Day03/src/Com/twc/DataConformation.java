package Com.twc;

import java.util.LinkedList;

public class DataConformation {
    /**
     * 数据结构的特点
     * 数组的特点：查找快，增删慢
     */
    public static void main(String[] args) {
        LinkedList<String>  link   = new LinkedList<String>();
        //添加元素
        link.addFirst("a");
        link.addFirst("b");
        link.addFirst("c");
        System.out.println(link);

        while(!link.isEmpty()){
            System.out.println(link.pop());
        }
        System.out.println(link);

    }

}
