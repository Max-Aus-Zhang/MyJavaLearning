package com.max.fanxinwork;

import java.util.List;

public class AnimalPlay {
    //按任务要求实现该类
    public void animalPlay(List <? extends Animal> animalList) {
        for (Animal animal : animalList) {
            animal.playGame();
        }
    }
}
