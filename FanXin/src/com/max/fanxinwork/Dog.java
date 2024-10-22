package com.max.fanxinwork;

public class Dog extends Animal{
    public Dog(String name) {
        this.setName(name);
    }

    @Override


    public void playGame() {
        System.out.println("小狗" +this.getName()+
                "玩游戏");
    }
}
