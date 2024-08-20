package ArrayList;
import java.util.*;

public class Remove_elements_from_list {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<=10; i++){
            list.add(i);
        }

        System.out.println(list);

//        To remove whole list.
//        list.clear();

//        to remove a single element: (Single elemetnt is removed by index)

        System.out.println("Enter index of the element to remove:");
        int idx = sc.nextInt();

        list.remove(idx);

        System.out.println(list);

    }
}
