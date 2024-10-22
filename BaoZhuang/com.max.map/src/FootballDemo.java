import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class FootballDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        HashMap map = new HashMap();
        map.put("2014", "德国");
        map.put("2010","西班牙");
        map.put("2006","意大利");
        map.put("2002","巴西");
        map.put("1998","法国");





        //使用迭代器的方式遍历
        Iterator <String> it = map.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+"  ");
        }

        System.out.println();

        //使用EntrySet同时获取key和value
        Set<Entry<String,String>> es = map.entrySet();
        for (Entry<String,String> e : es) {
            System.out.print(e.getKey()+"-"+e.getValue()+"  ");
        }

    }
}