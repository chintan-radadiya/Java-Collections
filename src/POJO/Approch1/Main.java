package POJO.Approch1;
import java.util.*;


public class Main {
    public static void main(String[] args){

        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


            System.out.println("Enter employee details below... ");
            System.out.println();

        while(true){
            System.out.println();

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Employee Name:");
            String name = sc.next();

            System.out.print("Enter Employee Salary:");
            int salary = sc.nextInt();

            Employee e = new Employee();

            e.setId(id);
            e.setName(name);
            e.setSalary(salary);

            list.add(e);

            System.out.println("Wanna add new Employee? (Y/N)");

            if(sc.next().charAt(0) =='n')
            {
                break;
            }
        }

        System.out.println("Employee details:");

        for(Employee e: list){
            System.out.println("Id:" + e.getId());
            System.out.println("Name:" + e.getName());
            System.out.println("Salary:" + e.getSalary());
            System.out.println("----------------------------------");
        }
    }
}
