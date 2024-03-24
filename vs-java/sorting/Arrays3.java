// Comparable interface
package sorting;

import java.util.Arrays;

// Comparable interface needs to implement for comparing userdefined data
class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return this.age+": "+this.name;
    }

    @Override
    public int compareTo(Student s){
        if(this.age>s.age){
            return 1;
        }else if(this.age<s.age){
            return -1;
        }else{ // if ages are equal than compare to name basis
            return this.name.compareTo(s.name);
        }
    }
}
public class Arrays3 {
    public static void main(String[] args) {
        Student[] stu1 = {
            new Student(10, "Varun"),
            new Student(12, "Vikas"),
            new Student(20, "Abhishek"),
            new Student(9, "Neeraj"),
            new Student(9, "Bharat")
        };
        System.out.println(Arrays.toString(stu1));
        Arrays.sort(stu1); // comparable interface is inbuilt for sorting  
        System.out.println(Arrays.toString(stu1));
    }
}
