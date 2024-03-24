public class SecondLarg {
    public static int getSecondLargest(int[] arr, int n){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,21,234,44,235,98};
        System.out.println("Second Largest Element = "+ getSecondLargest(arr, arr.length));
    }
    
}
