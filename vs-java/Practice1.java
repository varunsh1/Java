// getter and setter
class Employee {
    private int salary;
    private String name;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary = s;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setSalary(50000);
        obj.setName("Varun Sharma");
        System.out.println("Name = "+obj.getName());
        System.out.println("Salary = "+obj.getSalary());
    }
}

