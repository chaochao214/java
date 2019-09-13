package com.itheima.Zoye2;

public class MobileGame extends Game {
       public MobileGame(){

       }
        public MobileGame(String type, String name) {
            super(type, name);
        }
        private void efforts(){
            System.out.println("晚上不睡觉玩"+name);
        }
        private void damage(){
            System.out.println("导致白天上课困，毕业后找不到工作");
        }
        void play(){

            System.out.println("名为"+name+"的游戏十分流行");
            efforts();
            damage();
        }
        void prepare(){
            System.out.println("名为"+name+"的"+type+"类游戏十分流行");
        }




}
