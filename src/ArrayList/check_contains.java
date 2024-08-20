package ArrayList;
import java.util.*;

public class check_contains {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for(int i =1; i<=10;i++){
            list.add(i*100);
        }
        System.out.println(list);

        System.out.print("Enter value to check:");
        int val = sc.nextInt();

        System.out.println(list.contains(val));

    }
}