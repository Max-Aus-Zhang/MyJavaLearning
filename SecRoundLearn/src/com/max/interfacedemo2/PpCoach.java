package com.max.interfacedemo2;

public class PpCoach extends Coach implements LearnEng{
    public PpCoach() {
    }

    public PpCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(Player player) {
        System.out.println("教练"+this.getName()+"教运动员"+player.getName()+"打乒乓球");
    }

    @Override
    public void learnEng() {
        System.out.println(this.getName()+"学习英语中");
    }
}
