package Day3Stream.StreamAPI;

public class Employee {
    private String name;
    private int id;
    private int salary;
    Employee(){};
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
public String toString(){
        return id +" "+ name+ " "+salary;
    }

}
