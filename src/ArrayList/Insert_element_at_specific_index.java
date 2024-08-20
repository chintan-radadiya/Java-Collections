package ArrayList;
import java.util.*;

public class Insert_element_at_specific_index {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<=10;i++)
        {
            list.add(i);
        }
        System.out.println(list);

        System.out.print("Enter index to add element:");

         int idx = sc.nextInt();
        System.out.println();

        if(idx>=0 && idx<list.size()) {
            System.out.print("Enter element to add:");
            int ele = sc.nextInt();

            list.add(idx, ele);

            System.out.println(list);
        }else{
            System.out.println("Invalid Index!!");
        }


    }
}
