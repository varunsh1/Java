class Square{
    int side;
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }
}
public class Practice3 {
    public static void main(String[] args) {
        Square obj = new Square();
        obj.side = 2;
        System.out.println("area of square = "+obj.area());
        System.out.println("perimeter of square = "+obj.perimeter());
    }
}
