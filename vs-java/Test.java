public class Test {
    public static void main(String[] args) {
        long fact = 1l;
        int counter=0;
        int N = 42;
        for(int i=2; i<=N; i++){
            fact*=i;
        }
        System.out.println("factorial="+fact);
        while(fact>0){
            counter++;
            fact/=10;
        }
        System.out.println("counter="+counter);
    }
    
}
