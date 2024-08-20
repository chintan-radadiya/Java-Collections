package ArrayList;
import java.util.*;

public class Print_using_Iteratos
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        for (int i = 1; i <=10; i++) {
            list.add(i*10);
        }

        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + "\t");
        }

    }
}
