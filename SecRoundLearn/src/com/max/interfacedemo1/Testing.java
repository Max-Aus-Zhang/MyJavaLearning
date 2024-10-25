package com.max.interfacedemo1;

public class Testing {
    public static void main(String[] args) {
        Dog d = new Dog("BOBO",3);
        Cat c = new Cat("miaomia",2);
        Bird b = new Bird("cuicui",1);
        d.eat();
        d.swinming();
        c.eat();
        c.swinming();
        b.eat();

    }
}
