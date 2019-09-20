package com.twc.Demo3;
/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

注意你不能在买入股票前卖出股票。

 */
public class Demo121 {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 0; i<prices.length;i++){

            for(int j = 1;  j>i && j< prices.length;j++){
                System.out.println("ceui"+i+"数值"+j);
                if(prices[j]- prices[i] > profit){
                    System.out.println("测试啊");
                    profit = prices[j]- prices[i];
                }
            }
        }
        return profit;
    }

}
