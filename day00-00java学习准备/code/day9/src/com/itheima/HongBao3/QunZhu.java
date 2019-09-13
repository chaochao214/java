package com.itheima.HongBao3;

import java.util.ArrayList;
import java.util.Random;

public class QunZhu extends User {

    public ArrayList<Double> send(int money, int num) {
        if (money > leftMoney) {
            System.out.println("发红包数大于钱数");
            return null;
        }
        setLeftMoney(getLeftMoney() - money);

        money = money * 100;
        int m = money / num;
        int n = money % num;
       /* Random r = new Random();
        Random r = new Random();
*/

        ArrayList<Double> list = new ArrayList<>();
        if (n == 0) {
            list.add((double) m / 100);
            list.add((double) m / 100);
            list.add((double) m / 100);
            list.add((double) m / 100);
            list.add((double) m / 100);
        } else {
            list.add((double) (m + 1) / 100);
            list.add((double) (m + 1) / 100);
            list.add((double) (m + 1) / 100);
            list.add((double) (m + 1) / 100);
            list.add((double) (m + 1) / 100);
        }
        return list;
    }


}
