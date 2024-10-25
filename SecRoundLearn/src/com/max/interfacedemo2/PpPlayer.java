package com.max.interfacedemo2;

public class PpPlayer  extends Player implements LearnEng {
    public PpPlayer() {
    }

    public PpPlayer(String name, int age) {
        super(name, age);
    }


    public void learn() {
        System.out.println("乒乓球运动员"+this.getName() +
                "在进行训练");
    }


    public void learnEng() {
        System.out.println(this.getName()+"学习英语中");
    }
}
