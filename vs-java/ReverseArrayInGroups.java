interface DemoAnonymous {
    void print();
    void print2();
}

// @FunctionalInterface
interface DemoAnonymous1 {
    void print();
}
public class ReverseArrayInGroups{
    public static void main(String[] args) {
        // Anonymous class
        DemoAnonymous obj = new DemoAnonymous() {
            public void print(){
                System.out.println("Hello world");
            }
            public void print2(){
                System.out.println("Hello world");
            }
        };
        obj.print();

        // Lambda expressions
        DemoAnonymous1 obj2 = ()->{
            System.out.println("Hello world");
        };
        obj2.print();
    }
}