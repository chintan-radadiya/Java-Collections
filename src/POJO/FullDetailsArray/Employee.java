package POJO.FullDetailsArray;

public class Employee {

    private int id;
    private String name;
    private int salary;
    private int dept;
    private String city;


//    Getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDept() {
        return this.dept;
    }

    public String getCity() {
        return this.city;
    }

//    Setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }
}
