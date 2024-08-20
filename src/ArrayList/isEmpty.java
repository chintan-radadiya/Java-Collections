package ArrayList;
import java.util.*;

public class isEmpty {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<=5;i++)
        {
            list.add(i*20);
        }

        System.out.println(list);

        if(list.isEmpty()){
            System.out.println("List is Empty.");
        }else{
            System.out.println("List is not Empty.");
        }
    }
}
