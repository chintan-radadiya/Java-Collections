package POJO.FullDetailsArray;

import java.util.*;
import java.util.ArrayList;

public class Main {

    public static	void main(String[] args) {
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

        for(Employee e: list){
            System.out.println("Employee Id: " + e.getId());
            System.out.println("Employee Name: " + e.getName());
            System.out.println("Employee Salary: " + e.getSalary());
            System.out.println("Employee Department: " + e.getDept());
            System.out.println("Employee City: " + e.getCity());
        System.out.println("-------------------------");
        }

}
}
