package POJO.FullDetailsArray;


import java.util.*;
import java.util.ArrayList;

public class Main {

    public static	void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int[] ids = {101, 102, 103, 104, 105, 106};
        String[]	names	=	{"Amar",	"Hareen",	"Sathya",	"Annie",	"Raji",	"Harsha"};
        int[] salaries = {30000, 35000, 40000, 45000, 42000, 50000};
        int[]	depts =	{20, 10, 20, 20, 30, 10};
        String[]	cities	=	{"Hyderabad","Chennai","Bangalore","Hyderabad","Pune","Bangalore"};

        List<Employee> list = new ArrayList<Employee>();

        for(int i=0; i<ids.length; i++){

            Employee  e= new Employee();
            e.setId(ids[i]);
            e.setName(names[i]);
            e.setSalary(salaries[i]);
            e.setDept(depts[i]);
            e.setCity(cities[i]);

            list.add(e);
        }

    /*
        for(Employee e: list){
            System.out.println("Employee Id: " + e.getId());
            System.out.println("Employee Name: " + e.getName());
            System.out.println("Employee Salary: " + e.getSalary());
            System.out.println("Employee Department: " + e.getDept());
            System.out.println("Employee City: " + e.getCity());
            System.out.println("-------------------------");
        }
    */

//        Details using for loop in reverse order.
   /*     for(int i = list.size()-1; i>=0; i--){

            Employee e = list.get(i);

            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getSalary());
            System.out.println(e.getDept());
            System.out.println(e.getCity());
            System.out.println("=====================");
        }

    */

//        Display employee where ID is xyz.
   /*     System.out.println("Enter emp id to find the employee details:");
        int choice = sc.nextInt();

        for(Employee e : list){
            if(choice == e.getId()){

                System.out.println(e.getId());
                System.out.println(e.getName());
                System.out.println(e.getSalary());
                System.out.println(e.getDept());
                System.out.println(e.getCity());
                break;
            }
        }
*/

//        List employees from specific city.
    /*    System.out.println("Enter city name to print employee details:");
        String choice = sc.next();
        int count =0;

        for(Employee e: list) {
            if(e.getCity().equals(choice)){
                System.out.println(e.getId());
                System.out.println(e.getName());
                System.out.println(e.getSalary());
                System.out.println(e.getDept());
                System.out.println(e.getCity());
                count++;
            }
        }
        if(count == 0){
            System.out.println("City not Found !!");
        }
    */

//    Count of how mny employee working in hederabad.
    /*    int count =0;

        for(Employee e: list) {
            if(e.getCity().equals("Hyderabad") || e.getCity().equals("Chennai")){
                System.out.println(e.getId());
                System.out.println(e.getName());
                System.out.println(e.getSalary());
                System.out.println(e.getDept());
                System.out.println(e.getCity());
                System.out.println();
                count++;
            }
        }

        System.out.print("Employee count wirking in hyderabad and chennai is:" + count);
*/
}
}
