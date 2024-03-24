
import java.util.ArrayList;

class Customer{
  String name;
  int id;
  int balance;
  Customer(String name, int id, int balance){
    this.name = name;
    this.id = id;
    this.balance = balance;
  }
  @Override
  public String toString(){
    return "Hi, My name is "+ name + " and my id is "+ id + " my balance is "+ balance;
  }
  
}
public class UserDefinedCollections{
  public static void main(String aa[]){
    Customer c1 = new Customer("Varun" , 27, 20000);
    Customer c2 = new Customer("Rahul" , 26, 30000);
    Customer c3 = new Customer("Varun" , 25, 40000);
    
    ArrayList<Customer> a = new ArrayList<>();
    a.add(c1);
    a.add(c2);
    a.add(c3);

    for(Customer c: a){
        System.out.println(c);
    }

    ArrayList<Integer> ab = new ArrayList<>();
    ab.add(10);
    for(Integer c: ab){
        System.out.println(c);
    }


    
  }
}