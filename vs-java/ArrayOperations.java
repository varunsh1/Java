public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n =  arr.length;
        for(int i=0;i<n;i++){
            if(i==9)
                continue;
            arr[i]=i+10;
        }
        // traversal using foreach loop
        for(int val: arr){
            System.out.print(val+ ", ");
        }
        System.out.println();
        int newSize = insert(arr, n-1, 10, 4, 30);
        for(int ele: arr){
            System.out.print(ele+", ");
        }
        System.out.println("\nnewSize = " +newSize);
    }
    static int insert(int[] arr, int n, int cap, int pos, int x){
        if(n==cap){
            // if length of an array and capacity is same then no place is left to insert an element
            return -1;
        }
        int idx=pos-1;
        for(int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        
        return n+1;
    }
}
