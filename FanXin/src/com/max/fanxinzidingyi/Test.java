package com.max.fanxinzidingyi;

public class Test <T>{
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Test <Integer> test = new Test <Integer>();
        test.setNum(10);

        System.out.println(test.getNum());
    }
}
