package com.twc.ClassDemo2;
/*
引用类型方法总结




 */
public class Role {
        int  id;
        int  blood;
        String name;

        Weapon wp;
        Armour ar;

        public Weapon getWp(){
          return wp;
        };
        public void setWeapon(Weapon wp){
            this.wp= wp;
        }
        public Armour getArmour(Armour ar){
              return  ar;
        }
        public void setArmour(Armour ar){
            this.ar = ar;
        }
        //攻击方法
        public void  attack(){

            System.out.println("使用"+wp.getName()+",造成"+wp.getHurt()+"点伤害");
        }
        //穿戴盔甲
        public  void wear(){
            //增加防御，就是增加blood值
            this.blood += ar.getProtect();
            System.out.println("穿上"+ar.getName()+",生命值增加"+ar.getProtect());
        }

}
