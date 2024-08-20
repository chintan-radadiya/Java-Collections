package ArrayList;

import java.util.*;

public class ListIterator_backward{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        List<Integer> list = new ArrayList<>();


        for(int i=1; i<=10; i++){
            list.add(i);
        }
        System.out.println(list);

        ListIterator<Integer> itr = list.listIterator(list.size());
        while(itr.hasPrevious()){
            System.out.print(itr.previous() + "\t");
        }
    }}
