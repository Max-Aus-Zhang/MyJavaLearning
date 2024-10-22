package com.max.stringdemo;

public class StringDemo5 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
                sb.append("]");
            }else{sb.append(arr[i]).append(",");}

        }
        System.out.println(sb);
    }
    }

