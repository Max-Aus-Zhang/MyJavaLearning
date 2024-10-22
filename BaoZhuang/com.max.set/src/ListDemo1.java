import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListDemo1 {
    public static void main(String[] args) {
       List one = new ArrayList ();
       one.add("Java");
       one.add("C");
       one.add("C++");
        System.out.println("列表的数量"+one.size());
        System.out.println("**************");
        one.remove(2);
        for (int i = 0; i < one.size(); i++) {
            System.out.print(one.get(i)+",");
        }
    }
    }
