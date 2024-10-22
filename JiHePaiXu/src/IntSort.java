import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IntSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(19);
        list.add(2);

       for(int i: list){
           System.out.print(i+"   ");

       }

        Collections.sort(list);
        System.out.println("排序后");
       for(int i: list){
           System.out.print(i+"   ");
       }
    }
    }
