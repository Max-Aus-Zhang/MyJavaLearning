package com.max.xianchen;

public class RunnableTest {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("main thread");
        }

        Cat cat=new Cat();
        cat.run();
        Thread t1=new Thread(cat);
        t1.start();
    }
}
