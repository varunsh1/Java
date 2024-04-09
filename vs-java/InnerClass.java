class A{
    int age=10;
    public void display(){
        System.out.println("age = "+ this.age);
    }
    public class B {
        public void show(){
            System.out.println("This is inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();

        A.B obj1 = obj.new B();
        obj1.show();
    }
}
