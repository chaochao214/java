package com.itheima.Zoye1;

import java.util.ArrayList;
import java.util.Random;

public class FactoryImp extends Hat implements  Factory {

    @Override
    public ArrayList<Hat> piliang(int num) {
       ArrayList<Hat> list = new ArrayList<>();
       Random r = new Random();
        for (int i = 0; i <num ; i++) {
            Hat hat = new Hat();
            int  color = r.nextInt(80);
            System.out.println(i+"帽子的色号"+color);
            int  price  = r.nextInt(100);
            hat.setColor(color);
            hat.setPrice(price);
            list.add(hat);
        }
        return list;
    }

    @Override
    public void describe(Hat hat) {
        int color =  hat.getColor();
        if(hat.color % 2 == 0){
            System.out.println("黄色,价格为"+ hat.getPrice() );
        }
        else{
            System.out.println("红色,价格为"+hat.getPrice());
        }
    }


}
