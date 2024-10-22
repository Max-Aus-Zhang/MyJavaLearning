package com.max.work4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat mimi= new Cat("mimi",12,"英短");
        Cat fanfan = new Cat("fanfan",8,"中华田园猫");

//        hash set
        Set set = new HashSet();
        set.add(mimi);
        set.add(fanfan);
//        显示
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());;
        }
    }
}
