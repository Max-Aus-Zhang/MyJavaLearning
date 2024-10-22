package com.max.stringdemo;

import java.util.Scanner;
/*
* 判断字符串数据
* */
public class StringDemo1 {
    public static void main(String[] args) {
        System.out.println("plz input something");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int normalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            normalCount++;
            if (c >= 'a' && c <= 'z') {
                bigCount++;
            }if (c >= 'A' && c <= 'Z') {
                smallCount++;
            }else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }

        System.out.println("大写字母有" +bigCount+
                "个");
        System.out.println("小写字母有" +smallCount+
                "个");
        System.out.println("数字字母有" +numCount+
                "个");
        System.out.println("字母一共" +normalCount+
                "个");
        
    }
}
