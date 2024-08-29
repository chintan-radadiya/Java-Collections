package POJO.Approch1;


public class Employee {

//    Setting employee details using getters and setters.

    private int id;
    private String name;
    private int salary;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }
}
