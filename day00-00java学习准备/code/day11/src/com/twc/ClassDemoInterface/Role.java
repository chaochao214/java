package com.twc.ClassDemoInterface;

public class Role {
    FashuSkill fs;


    public void setFashuSkill(FashuSkill fs){
        this.fs = fs;
    }
    public void faShuSkillAttack(){
        System.out.println("发动法术攻击");
        fs.fashuAttack();
        System.out.println("攻击完毕");    }

}
