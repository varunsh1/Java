import java.util.*;
public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("gfg", 1);
        map.put("course", 11);
        System.out.println(map);
        for(Map.Entry<String, Integer> el: map.entrySet()){
            System.out.println(el.getKey() + " " + el.getValue());
        }
        System.out.println(map.putIfAbsent("gfg", 99));
        System.out.println(map);

    }
    
    // two arrays as input and count the union elements
    public int count(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>();
        for(int el: a){
            set.add(el);
        }
        for(int el: b){
            set.add(el);
        }
        
        return set.size();
    }
    
    // pair with given sum, time comp=O(n), space=O(n)
    // arr[] = {8,3,4,2,5}, sum=6
    boolean isPair(int[] arr,int sum){
        HashSet<Integer> set = new HashSet<>();
        for(int el: arr){
            int target = sum-el;
            if(set.contains(target)){ // it will not count the self val ex: 3+3=6
                return true;
            }
            set.add(target);
        }
        return false;

    }

    // subarray with 0 sum ,  time comp = , space = 
    // subarray: contiguous element, 
    
}
