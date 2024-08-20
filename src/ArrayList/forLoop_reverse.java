package ArrayList;
import java.util.*;

public class forLoop_reverse {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<= 5; i++){
            list.add(i*5);
        }
        System.out.println(list);


        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + "\t");
        }

    }
}
