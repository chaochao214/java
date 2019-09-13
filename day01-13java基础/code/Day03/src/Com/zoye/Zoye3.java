package Com.zoye;

import java.util.LinkedList;

public class Zoye3 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();
        arr.add("西门吹雪");
        arr.add("西门吹雪2");
        arr.add("西门吹雪3");
        arr.add("西门吹雪4");
        arr.add("西门吹雪5");
        arr.add("西门吹雪6");
        arr.add(2,"波风水门");
        arr.set(0,"666");

        System.out.println(arr);


    }
}
