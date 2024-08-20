package ArrayList;
import java.util.*;

public class Print_list_size {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1;i<=5;i++){
            list.add(i*10);
        }

        System.out.println(list);
        System.out.println(list.size());


    }

}
