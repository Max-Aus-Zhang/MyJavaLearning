package com.max.stringdemo;

import java.util.Random;

public class StringDemo9 {


    public static void main(String[] args) {

        char [] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i<=25){
                chars[i] = (char)(97+i);
            } else{
                chars[i] = (char)(65+i-26);
            }
        }

        String code ="";
        Random rand = new Random();
        for(int i=0; i<4; i++){
            int randomNum = rand.nextInt(chars.length);
            code = code+chars[randomNum];
        }
        int num = rand.nextInt(11);
        code = code+num;
        char[] chCode = code.toCharArray();
        shuffleArray(chCode);
        System.out.println(chCode);

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
