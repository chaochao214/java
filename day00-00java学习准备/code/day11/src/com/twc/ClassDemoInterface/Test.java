package com.twc.ClassDemoInterface;

public class Test {
    public static void main(String[] args) {
       //游戏角色
        Role  a  = new Role();
       //设置角色法术技能
        a.setFashuSkill(new FashuSkill() {
            @Override
            public void fashuAttack() {
                System.out.println("火球术");
            }
        });
        //发动法术技能
        a.faShuSkillAttack();

    }
}
