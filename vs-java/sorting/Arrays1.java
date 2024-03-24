package sorting;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {
    public static void main(String[] args) {
        // for primitive data sorting
        int[] arr1 = {1,2,3,1,5,2,6};
        Arrays.sort(arr1); // to sort in ascending order
        System.out.println(arr1); // it will print reference of arr1
        System.out.println(Arrays.toString(arr1)); // print arr1 elements
        
        // for non primitive data sorting
        Integer[] arr2 = {1,3,5,11,9,2,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        // to sort in reverse order
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }    
}
