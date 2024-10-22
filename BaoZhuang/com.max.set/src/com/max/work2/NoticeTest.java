package com.max.work2;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
//        创建对象
        Work2 n1=new Work2(1,"welcome","管理员",new Date());
        Work2 n2=new Work2(2,"send your work","teacher",new Date());
        Work2 n3 =new Work2(3,"check in","teacher",new Date());

//        添加公告
        ArrayList nlist=new ArrayList();
        nlist.add(n1);
        nlist.add(n2);
        nlist.add(n3);

//        display notice
        System.out.println("公告的内容为:");
        for(int i=0;i<nlist.size();i++){
            System.out.println(i+1+":"+((Work2)(nlist.get(i))).getTitle());

        }

    }
}
