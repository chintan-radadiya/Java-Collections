package ArrayList;

import java.util.*;

public class forLoop_forward {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1;i<=5;i++){
            list.add(i*10);
        }
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+"\t" );
        }

    }

}
