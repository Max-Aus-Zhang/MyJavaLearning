package com.max.interfacedemo2;

public class BasketCoach extends Coach {
    public BasketCoach() {
    }

    public BasketCoach(String name, int age) {
        super(name, age);
    }


    @Override
    public void teach(Player player) {
        System.out.println("教练"+this.getName()+"训练球员"+player.getName()+"怎么打球");
    }
}
