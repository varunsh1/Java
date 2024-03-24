import javafx.util.Pair;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("*** Digital root ***");
        System.out.println("Root = "+digitalRoot(19992));
    }
    static int digitalRoot(int n){
        if(n==0){
            return 0;
        }
        int sum = 0;
        sum+=n%10+digitalRoot(n/10);
        System.out.println("Calling recursion for "+ n/10);
        if(sum>9){
            System.out.println("Sum="+sum);
            return sum%10+digitalRoot(sum/10);
        }
        return sum;
        Pair<Integer, String> p
            = new Pair<Integer, String>(10, "Hello Geeks!");
 
        // printing the values of key and value pair
        // separately
        System.out.println("The First value is :"
                           + p.getKey());
        System.out.println("The Second value is :"
                           + p.getValue());
    }
}
