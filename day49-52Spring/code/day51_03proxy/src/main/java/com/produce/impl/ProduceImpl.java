package com.produce.impl;

import com.produce.Producer;

/**
 * @Author: twc
 * @Date 2019/5/30 9:08
 **/
public class ProduceImpl implements Producer {

    @Override
    public void saleProduct(float money) {
        System.out.println("销售产品"+money);
    }

    @Override
    public void afterService(float money) {
        System.out.println("售后服务"+ money );

    }
}
