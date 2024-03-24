import java.util.Arrays;

public class FactorialZeros {
    public static void main(String[] args) {
    int n = 6;
    int r = 0;
    while(n>0){
        n = n/5;
        r = r+n;
    }
    System.out.println("No of zeros = "+ r);
    int A[][]={{1,2},{3,4}};
    System.out.println(Arrays.asList (A));
}
}
