package com.max.interfacedemo2;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球员"+this.getName()+"进行篮球训练");
    }
}
