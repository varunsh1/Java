class Josephus {
    static int josephus(int n, int k)
    {
    if (n == 1)
        return 0;
    else
        return (josephus(n - 1, k) + k) % n ;
    }
    
    // Driver Program to test above function
    public static void main(String[] args)
    {
    int n = 7;
    int k = 3;
    System.out.println("The chosen place is " + 
                               josephus(n, k));
    }
}
