package com.twc.jlyi.线程安全.sellTickets;

public class sellTickets implements Runnable {
    private int tickets = 100;
    String locks = "aa";

    @Override
    public void run() {
        //每个窗口的卖票操作
        while (true) {
            synchronized (locks) {

                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "在卖" + tickets--);

                }
            }
        }

    }
}

