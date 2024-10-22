package com.max.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testDemo  {
    public static void main(String[] args) {
          Cat a= new Cat("哆啦A梦",23,"机器猫");
          Cat b=new Cat("黑猫警长",45,"奶牛猫");
          Cat c=new Cat("加菲猫",66,"橘猫");

        List<Cat> catsO=new ArrayList<Cat>();
        catsO.add(a);
        catsO.add(b);
        catsO.add(c);
        System.out.println("排序前");
        for (Cat cat : catsO) {
            System.out.println(cat);
        }
        System.out.println("名字排序后");
        Collections.sort(catsO, new SortByName());
        for (Cat cat : catsO) {
            System.out.println(cat);
        }

        System.out.println("按年龄降序排序");
        Collections.sort(catsO, new SortByAgeComparator());
        for (Cat cat : catsO) {
            System.out.println(cat);
        }
    }
}
