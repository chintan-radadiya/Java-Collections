package ArrayList;
import java.util.*;

public class get_element_from_index {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<=10; i++){
            list.add(i*10);
        }
        System.out.println(list);

        System.out.println();
        System.out.print("Enter index to get element of that Index:");
        int idx = sc.nextInt();

        if(idx>=0 && idx <list.size()){
            System.out.println(list.get(idx));
        }else{
            System.out.println("Index is Invalid !!");
        }
    }
}
