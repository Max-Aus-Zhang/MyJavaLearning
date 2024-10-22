package com.max.stringdemo;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        int result = int1*int2;
        String finalResult = String.valueOf(result);
        System.out.println(finalResult);


    }
}
