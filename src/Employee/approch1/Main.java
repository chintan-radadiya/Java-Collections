package Employee.approch1;

import java.util.*;

public class Main {
    public static void main(String[] args){

        List<Employee> list = new ArrayList<Employee>();

        Employee e1 = new Employee(1,"Chintan",1000000);
        Employee e2 = new Employee(2,"Patil",50000);
        Employee e3 = new Employee(3,"Pathak",100000);

        list.add(e1);
        list.add(e2);
        list.add(e3);

//      Display reverse using listIterator.
        ListIterator <Employee> listitr = list.listIterator();

        while(listitr.hasNext()){
            Employee e = listitr.next();

            System.out.println("ID:" + e.id);
            System.out.println("Name:"+ e.name);
            System.out.println("Salary:" + e.salary);
            System.out.println("------------------------------------");
        }

//        Display using for each loop
        /*
            for(Employee e : list){
                System.out.println("ID:" + e.id);
                System.out.println("Name:"+ e.name);
                System.out.println("Salary:" + e.salary);
                System.out.println("------------------------------------");
            }
        */

//           Display using for loop.
    /*      for(int i=0; i<list.size(); i++){
                Employee e = list.get(i);

                System.out.println("ID:" + e.id);
                System.out.println("Name:"+ e.name);
                System.out.println("Salary:" + e.salary);
                System.out.println("------------------------------------");

            }
        */

//        Display using itaretor.
    /*
        Iterator <Employee> itr = list.iterator();
        while (itr.hasNext()){
            Employee e = itr.next();

            System.out.println("ID:" + e.id);
            System.out.println("Name:"+ e.name);
            System.out.println("Salary:" + e.salary);
            System.out.println("------------------------------------");
        }
    */
    }
}
