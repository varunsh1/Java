public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverse(arr, n);

    }
    static void reverse(int[] arr, int n){
        int low=0, high=n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int el: arr){
            System.out.print(" "+ el);
        }
        System.out.println();
    }
}
