package com.max.shurushuchu;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;

public class ZijieWork {
    public static void main(String[] args) {
        transWriteByBuf("hello.txt","你好吗?\r\n我很好");
        transReadByBuf("hello.txt");
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
        }


        public static void transWriteByBuf(String fileName, String content) {
            try {


                FileOutputStream fos = new FileOutputStream(fileName);
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);

            bw.write(content);
                bw.flush();
                bw.close();
                osw.close();
                fos.close();



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static void transReadByBuf(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line!= null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
           isr.close();
           fis.close();




        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
