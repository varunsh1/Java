public class CountDigits {
    // approach 1: directly count the values after dividing the number with 10 : time  comp = O(n)
    public static int count(int n){
        int counter = 0;
        while(n>0){
            n/=10;
            counter++;
        }
        return counter;
    }
    // approach 2: use log10(n) and then find Math.floor + 1, time complexity = O(1)
    public static int count1(long n){
        return (int)Math.floor(Math.log10(n)+1); 
    }
    // approach 3: use recursive approach to count digits, time complexity = O(logn)
    public static int count2(int n){
        if (n/10==0){
            return 1;
        }
        return 1+count2(n/10);
    }
    public static void main(String[] args) {
        int n = 1120;
        System.out.println("number1 = "+n);
        System.out.println("Number of digits1="+count(n));
        long n1 =100l;
        System.out.println("number2 = "+n1);
        System.out.println("Number of digits2="+count1(n1));
        System.out.println("number3 = "+n);
        System.out.println("Number of digits3="+count2(n));
    }
}
