package _01_3java基础40_60;

public class _47sleep和wait的区别 {


}
class  multiThread{

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Thread2()).start();
    }
}
class Thread1 implements  Runnable{
    @Override
    public void run() {
        synchronized (multiThread.class){
            System.out.println("enterthrea1...");
            System.out.println("thread1 is waiting");
            try{
                multiThread.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread1 is going on ...");
            System.out.println("thread1 is being over!");
        }


    }
}

class  Thread2 implements Runnable{

    @Override
    public void run() {
        synchronized (multiThread.class){
            System.out.println("enter thread2...");
            System.out.println("thread2 notify  thread can release wait status..");
            multiThread.class.notify();
            System.out.println(" thread2 is sleeping ten millisecond...");
            try{
                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread2 is going  on");
            System.out.println("thread2 is being  over");
        }
    }
}














