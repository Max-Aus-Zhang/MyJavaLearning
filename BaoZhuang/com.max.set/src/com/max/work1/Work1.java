package com.max.work1;
import java.util.ArrayList;
import java.util.List;

public class Work1 {
    public static void main(String[] args) {
        List st = new ArrayList();
        st.add("语文");
        st.add("数学");
        st.add("英语");
        st.add("化学");
        st.add("物理");
        st.add("生物");
        System.out.println("列表中元素的个数为:" +st.size()+
                "个");
        for (int i = 0; i < st.size(); i++) {
            System.out.println("第"+(i+1)+"个为"+st.get(i));
        }
    }
}
