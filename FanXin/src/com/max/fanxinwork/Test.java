package com.max.fanxinwork;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //定义List并添加Dog类对象
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("旺财"));
        dogList.add(new Dog("狗蛋"));



        //定义List并添加Cat类对象
        List<Cat> catlist = new ArrayList<>();
        catlist.add(new Cat("咪咪"));
        catlist.add(new Cat("喵喵"));

        //使用AnimalPlay类的方法，按照演示效果输出内容
        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.animalPlay(dogList);
        animalPlay.animalPlay(catlist);



    }
}