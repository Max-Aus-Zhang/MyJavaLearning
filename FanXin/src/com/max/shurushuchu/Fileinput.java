package com.max.shurushuchu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinput {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/com/max/shurushuchu/speech.txt");
            int n = fis.read();
            System.out.print("文件内容:");
            int count=0;
            while (n!=-1){
                System.out.print((char)n);
                n = fis.read();

                count++;

            }
            File file = new File("src/com/max/shurushuchu/speech.txt");

            System.out.println();
            System.out.println("统计结果:"+file.getName()+"文件中共有" +
                    count+"个字节");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }


    }
}
