package com.max.stringdemo;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入语句");
        String s = sc.nextLine();
//        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        int count =0;
        for (int i = s.length()-1; i >0 ; i--) {
            char ch = s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
                count++;
            }else {
                break;
            }

        }
        sb.reverse();
        System.out.println("最后一个单词长度为:"+count+"它是"+sb.toString());
    }
}
