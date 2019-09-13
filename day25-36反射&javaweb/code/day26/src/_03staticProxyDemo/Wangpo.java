package _03staticProxyDemo;

public class Wangpo implements  IKindWomen {
   //依赖倒置原则：依赖抽象不依赖具体
    private  IKindWomen women;
    public Wangpo(IKindWomen women) {
        this.women = women;
    }
    /**
     *  执行核心方法之前的工作
     */
    private  void openHouse(){
        System.out.println("战前准备");
    }
    @Override
    public void happy() {
        openHouse();
        women.happy();
        clear();
    }



    @Override
    public double collect(double money) {
       // 1.王婆扣除手续费
        System.out.println("王婆收取服务费"+money*0.4);
        //调用委托者的收钱方法
        women.collect(money*0.6);
        return  money*0.4;

    }


    private void clear() {
        System.out.println("打扫战场");
    }
}
