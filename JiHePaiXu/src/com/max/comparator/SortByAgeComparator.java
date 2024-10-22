package com.max.comparator;
import java.util.Comparator;

public class SortByAgeComparator implements Comparator <Cat>{
    @Override
    public int compare(Cat o1,Cat o2) {
       int age1 = o1.getAge();
       int age2 = o2.getAge();
       return age2-age1;
    }
}
