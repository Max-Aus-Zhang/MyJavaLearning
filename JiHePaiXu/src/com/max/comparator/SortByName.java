package com.max.comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Object> {
    @Override
    public int compare(Object o1,Object o2) {
//        名字升序
        Cat cat1 = (Cat)o1;
        Cat cat2 = (Cat)o2;
        String name1 = cat1.getName();
        String name2 = cat2.getName();
        return name1.compareTo(name2);
    }
}
