@FunctionalInterface
interface Prac1{
    void print();
}

class Child implements Prac1{
    @Override
    public void print(){
        System.out.println("Why are you implementing interface when you have Lambda and Anonymous class concepts");
    }
}
public class Practice {
    public static void main(String[] args) {
        Prac1 p1 = new Prac1(){
            public void print(){
                System.out.println("Hello world");
            } 
        };
        p1.print();
        Prac1 p2 =()->{
            System.out.println("My name is varun sharma");
        };
        p2.print();
        Child p3 = new Child();
        p3.print();
        Prac1 p4 = new Child();
        p4.print();
    }
}
