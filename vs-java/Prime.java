public class Prime {
    public static void main(String[] args) {
        // naive approach: O^n
        int n = 5;
        if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isPrime2(int n){
        for(int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
