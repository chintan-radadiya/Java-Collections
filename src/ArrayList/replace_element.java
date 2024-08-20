package ArrayList;
import java.util.*;

public class replace_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list =new ArrayList<>();

        for (int i = 1; i <= 20 ; i++) {
            list.add(i*10);
        }
        System.out.println(list);

        System.out.print("Enter element to replace:");
        int ele = sc.nextInt();

        if(list.contains(ele)){

            System.out.print("Enter new element:");
            int newel = sc.nextInt();
            int idx = list.indexOf(ele);

            list.set(idx,newel);

            System.out.println(list);
        }else{
            System.out.println("Element does not exist!!");
        }
    }
}
