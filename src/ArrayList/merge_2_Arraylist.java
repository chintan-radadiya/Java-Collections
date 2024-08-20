package ArrayList;
import java.util.*;

public class merge_2_Arraylist {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            list.add(i*10);
            list2.add(i*5);
        }

        System.out.println(list);
        System.out.println(list2);

list.addAll(list2);
        System.out.println("Merged list:"   + list);



    }
}
