class Rectangle{
    int l, b;
    int area(){
        System.out.println("hello world");
        return l*b;
    }
    int perimeter(){
        return 2*(l+b);
    }
}
public class Practice4 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.l=10;
        obj.b=20;
        System.out.println("area of rectangle = "+obj.area());
        System.out.println("perimeter of rectangle = "+ obj.perimeter());
        System.out.println("length = "+obj.l+", breadth = "+obj.b);
    }
}
