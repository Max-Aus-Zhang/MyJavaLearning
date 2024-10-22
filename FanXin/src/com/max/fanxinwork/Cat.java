package com.max.fanxinwork;

public class Cat extends Animal {
    public Cat(String name) {
        this.setName(name);
    }

    @Override
    public void playGame() {
        System.out.println("小猫" +this.getName()+
                "玩游戏");
    }
}
