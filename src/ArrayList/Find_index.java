package ArrayList;
import java.util.*;

public class Find_index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i=1; i<=10;i++){
            list.add(i*10);
        }
        System.out.println(list);

        System.out.print("Enter element to find index:");
        int ele = sc.nextInt();

        if(list.contains(ele)){
            System.out.print("The index is: " + list.indexOf(ele) );
        }else{
            System.out.println("Element is not in the list.");
        }
    }
}
