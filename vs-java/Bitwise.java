public class Bitwise {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println("3 & 6 = "+(a&b));
        System.out.println("3 | 6 = "+(a|b));
        System.out.println("3 ^ 6 = "+(a^b));
        System.out.println("~3 = "+(~3));

        // power of 2
        int p = 1;
        int n = 0;
        for(int i=0;i<n;i++){
            p = p*2; // p = 1*2=2, 2*2=4, 4*2=8
        }
        System.out.println("power of 2="+p);
        // using left shift operator in O(1)
        int pp = 1<<n;
        System.out.println("power of 2="+pp);
        // iterative power of any number
        int val=3;
        int po = 3;
        int res = 1;
        while(po>0){
            if(po%2!=0){
                res = res*val;
            }
            val=val*val;
            po/=2;
        }
        System.out.println("power of n="+res);
        int x = 0xa;
        int y = 07;
        System.out.println("x="+x);
        System.out.println("y="+y);                                           
        System.out.println("~2="+(~2));
            }
    
    }
