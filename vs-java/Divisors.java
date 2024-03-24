public class Divisors {
    public static void main(String[] args) {
        int n = 16;
        getDivisors(n);
    }
    static void getDivisors(int n){
        int i;
        for (i=1;i*i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
}
