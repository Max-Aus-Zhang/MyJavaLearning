package com.max.shurushuchu;

import java.io.*;

public class HuanchongWork {
    public static void main(String[] args) {
        long duration1=0;

        try {
            long startTime = System.currentTimeMillis();
            FileOutputStream fos = new FileOutputStream("one.txt");
            File file = new File("one.txt");
            String fileName = file.getName();
            System.out.println(fileName + "不使用缓冲流写");

            for (int i = 0; i < 100000; i++) {
                fos.write('a');
            }

            fos.close();

            FileInputStream fis = new FileInputStream("one.txt");
            int n = fis.read();

            while (n != -1) {


                System.out.print((char) n);
                n = fis.read();

            }
            long endTime = System.currentTimeMillis();
            duration1 = endTime - startTime;
            System.out.println("用时:" + duration1 + "ms");
            fis.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            long startTime2 = System.currentTimeMillis();
            FileOutputStream fos = new FileOutputStream("two.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            File file = new File("two.txt");
            String fileName = file.getName();
            System.out.println(fileName + "使用缓冲流来写");

            for (int i = 0; i < 100000; i++) {
                bos.write('x');
            }
            bos.close();

            FileInputStream fis = new FileInputStream("two.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int n = bis.read();
            while (n != -1) {
                System.out.print((char) n);
                n=bis.read();

            }
            bis.close();
            long endTime2 = System.currentTimeMillis();
            long duration2 = endTime2 - startTime2;
            System.out.println("用时:" + duration2 + "ms");
            long result= duration1-duration2;
            System.out.println("节省了:"+result+"ms");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
