public class Sieve {
    public static void main(String[] args) {
        Sieve e = new Sieve();
        e.sieveOFEratosthenes(20);
    }
    void sieveOFEratosthenes(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i] = true;
        }
        for(int p=2;p*p<=n;p++){
            if (prime[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }
        System.out.print("prime numbers are = ");
        for(int i=2;i<=n;i++){
            if(prime[i]==true){
                System.out.print(i+",");
            }
        }
    }
}
