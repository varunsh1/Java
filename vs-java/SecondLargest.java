public class SecondLargest {
    public static int findSecondLargest(int n, int[] a) {
        int largest=a[0];
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                secondlargest=largest;
                largest=a[i];
            }
            else if(a[i]<largest && a[i]>secondlargest){
                secondlargest=a[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            return -1;
        }
        return secondlargest;   
        }
    public static void main(String[] args) {
        int[] a =  {10,11,2,24,99,77,55};
        int secondLargestElement=findSecondLargest(a.length,a );
        System.out.println("Second largest element ="+secondLargestElement);

    }
}