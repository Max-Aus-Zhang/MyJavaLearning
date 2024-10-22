package com.max.shurushuchu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileout {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/com/max/shurushuchu/speech.txt");
            fos.write(50);
            fos.write('a');
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
