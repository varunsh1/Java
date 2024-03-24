public class RemoveArrayDuplicate{
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,5,1,0,2,5};
        int n= arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for(int el: arr){
            System.out.print(el+" ");
        }
    }
}