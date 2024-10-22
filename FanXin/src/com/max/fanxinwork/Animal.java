package com.max.fanxinwork;

public abstract class Animal{
    //按任务要求实现该类
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public abstract void playGame();
}