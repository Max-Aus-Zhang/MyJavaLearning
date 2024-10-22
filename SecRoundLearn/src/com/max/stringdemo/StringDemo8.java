package com.max.stringdemo;

import java.util.Random;
import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1Enter a string");
        String s = sc.nextLine();
        char [] chars = s.toCharArray();
        shuffleArray(chars);
        for (char aChar : chars) {
            System.out.print(aChar);
        }

    }



    public static  void shuffleArray(char[] chars) {
        Random rand = new Random();
        for (int i = chars.length-1; i>0; i--) {
            int j = rand.nextInt(i+1);

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }

}
