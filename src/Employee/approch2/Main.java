package Employee.approch2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){

        int[] ids = {101, 102, 103, 104, 105};
        String[]	names	=	{"Amar", "Annie", "Harini", "Satya", "Jai"};
        int[] salaries = {23000, 56000, 43000, 48000, 16000};

        List<Employee> list = new ArrayList<Employee>();

        for(int i=0; i< ids.length; i++){

            Employee e = new Employee(ids[i],names[i],salaries[i]);
            list.add(e);
        }

//      Using list iterator
        ListIterator<Employee> listitr = list.listIterator(5);

        while(listitr.hasPrevious()){
            Employee e = listitr.previous();
            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.salary);
            System.out.println("---------------------");

        }



//        Using for loop
    /*    for(Employee e : list){
            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.salary);
            System.out.println("---------------------");
        }
    */

    }
}
