package com.twc.Zoye;

        import java.util.HashMap;
        import java.util.Map;

public class Zoye7{
    public static void main(String[] args) {
        String[] a = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] b = {"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String>  map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i],b[i]);

        }
        System.out.println(map);

    }
}
