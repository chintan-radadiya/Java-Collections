package ArrayList;
import java.sql.Array;
import java.util.*;


public class Display_from_specific_index {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=10; i++){
            list.add(i*10);
        }
        System.out.println(list);

        ListIterator<Integer> itr = list.listIterator(5);           // Notice here

        while(itr.hasNext()){
            System.out.print(itr.next() + "\t");
        }

    }
}
