// Comparator interface
package sorting;

import java.util.Arrays;
import java.util.Comparator;

class Student{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return this.age+ ": "+this.name;
    }
}
public class Arrays2 {
    // user defined non primitive data sorting
    public static void main(String[] args) {
        // create arrays of Student
        Student[] stu = {
            new Student(10, "Varun"),
            new Student(12, "Vikas"),
            new Student(20, "Aman"),
            new Student(9, "Abhishek")
        };
        System.out.println(Arrays.toString(stu));

        // to sort user defined data type we need to use comparator or comparable

        /* using lambda expressions
        Comparator<Student> com = (a,  b)->{
                return b.name.compareTo(a.name);
        };
        */

        // using anonymous class expressions
        Comparator<Student> com = new Comparator<>(){
            @Override 
            public int compare(Student a, Student b){
                if(a.age>b.age){
                    return 1;
                }
                return -1;
            }
        };
        Arrays.sort(stu,com);
        System.out.println(Arrays.toString(stu));
    }
}
