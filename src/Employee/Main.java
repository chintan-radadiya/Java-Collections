package Employee;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee(1,"Chintan",50000);
        Employee e2 = new Employee(2,"Shreya",30000);
        Employee e3 = new Employee(3,"Riya",20000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

}
