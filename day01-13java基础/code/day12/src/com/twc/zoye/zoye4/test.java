package com.twc.zoye.zoye4;

public class test {
    public static void main(String[] args) {
        RandomUtil ru = new RandomUtil();
        getRandomNumFromOneToNum(10, new NumberSupplier() {
            @Override
            public int getNum(int... nums) {
                return ru.nextInt(10);
            }
        });

        getRandomNumFromOneToNum(10 ,ru::nextInt);
        //???怎么用lamda表达式完成
       // getRandomNumFromOneToNum(10 ,(10)->ru.nextInt(10));




    }

    static void getRandomNumFromOneToNum(int num, NumberSupplier ns) {
        int result = ns.getNum(num);
        System.out.println(result);
    }

    static void getRandomNumFromAtoB(int a, int b, NumberSupplier ns) {
        int result = ns.getNum(a, b);
        System.out.println(result);
    }

    static void getRandomNumFromArray(int[] nums, NumberSupplier ns) {
        int result = ns.getNum(nums);
        System.out.println(result);
    }


}
