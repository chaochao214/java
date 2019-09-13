package com.produce;

/**
 * @Author: twc
 * @Date 2019/5/30 9:07
 **/
public interface Producer {
    /**
     * 销售工作
     * @param money
     */
    public void  saleProduct(float money);
    /**
     *  售后
     */
    public  void afterService(float money);

}
