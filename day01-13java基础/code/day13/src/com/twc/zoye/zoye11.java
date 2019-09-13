package com.twc.zoye;

import java.util.Arrays;
import java.util.stream.Stream;

public class zoye11 {
    public static void main(String[] args) {

        String[] provinces = {"河北省", "山西省", "吉林省", "辽宁省",
                "黑龙江省", "陕西省", "甘肃省", "青海省", "山东省", "福建省", "浙江省",
                "台湾省", "河南省", "湖北省", "湖南省", "江西省", "江苏省", "安徽省",
                "广东省", "海南省", "四川省", "贵州省", "云南省", "北京市", "天津市",
                "上海市", "重庆市", "内蒙古自治区", "新疆维吾尔自治区", "宁夏回族自治区",
                "广西壮族自治区", "西藏自治区", "香港特别行政区", "澳门特别行政区" };
        //1. province是三个字的省份的个数
        long numOne = Arrays.stream(provinces).filter(s -> s.length() == 3).count();
        System.out.println( numOne);

        // 省份中包含东南西北的个数
        Stream<String> stringS = Arrays.stream(provinces).filter(s -> s.contains("东") || s.contains("南") || s.contains("西") || s.contains("北"));
        stringS.forEach(System.out::print);
        //所有特殊省份的地方提取出来放到新数组中
        String[] ps    = Stream.of(provinces).filter(s->!s.contains("省")).toArray(String[]::new);
        System.out.println("新数组"+Arrays.toString(ps));
    }
}
