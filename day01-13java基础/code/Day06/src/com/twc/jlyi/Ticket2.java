package com.twc.jlyi;

public class Ticket2  implements Runnable{

    private int ticket  =100;

    @Override
    public void run() {
        while(true){
            //sellTicket();
        }
    }

    public synchronized void sellTicket(){
        if(ticket>0){//有票可以操作
         try{
             Thread.sleep(100);
         }catch(InterruptedException e){
             e.printStackTrace();
         }

        }
        //
        String name = Thread.currentThread().getName();
        System.out.println(name+"正在卖"+ticket--);
    }
}
