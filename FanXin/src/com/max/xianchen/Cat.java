package com.max.xianchen;

public class Cat implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+" A Cat");
        }
    }
}
