package com.max.normalpaixu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Aapple");
        list.add("Orange");
        list.add("Peach");
        list.add("Kiwi");
        list.add("Banana");

        for (String i:list){
            System.out.print(i+"  ");
        }
        System.out.println("排序后");
        Collections.sort(list);
        for (String i:list){
            System.out.print(i+"  ");
        }
    }
}
