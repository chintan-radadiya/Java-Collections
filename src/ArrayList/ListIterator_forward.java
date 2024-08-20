package ArrayList;
import java.util.*;

public class ListIterator_forward {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        List<Integer> list = new ArrayList<>();


        for(int i=1; i<=10; i++){
            list.add(i);
        }
        System.out.println(list);

       ListIterator<Integer> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + "\t");
        }
    }
}
