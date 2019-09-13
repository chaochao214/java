package com.twc.Zoye;

import com.twc.jlyi.lambdaDemo.Calculator;

public class zoye10 {
    public static void main(String[] args) {
        //调用 lambda 标准格式省略格式 计算结果
        invokeCalc(130,120,(int a, int b)-> {return a-b;});
        //省略格式
        invokeCalc(130,120,(a,b)-> a-b);

    }
    private static void invokeCalc(int a, int b, Calculator cal){
        int result =cal.calc(a,b);
        System.out.println( "结果是"+result);

    }

}
