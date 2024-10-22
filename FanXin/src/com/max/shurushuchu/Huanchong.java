package com.max.shurushuchu;

import java.io.*;

public class Huanchong {
    public static void main(String[] args) {

        try {
            FileOutputStream fos= null;
            fos = new FileOutputStream("one.txt");
//            BufferedOutputStream bos=new BufferedOutputStream(fos);
            FileInputStream fis=new FileInputStream("two.txt");
//            BufferedInputStream bis=new BufferedInputStream(fis);

            FileOutputStream fos2= null;
            fos2 = new FileOutputStream("two.txt");
            BufferedOutputStream bos2=new BufferedOutputStream(fos);
            FileInputStream fis2=new FileInputStream("two.txt");
            BufferedInputStream bis2=new BufferedInputStream(fis);

            int n=0;



        }
       catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
