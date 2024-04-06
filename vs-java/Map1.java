// hashing based GFG solutions
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

    // count distinct elements in an array: time = O(n) , space = O(n)
    void countDistinct(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int el: arr){
            set.add(el);
        }
        System.out.println("Distinct elements are = "+set.size());
    }
    
    // two arrays as input and count the union elements : time = O(n), space = O(n)
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
            if(set.contains(target)){ // it will not count the self val ex: 3+3=6, it is also called lookup table
                return true;
            }
            set.add(target);
        }
        return false;

    }

    // subarray with 0 sum ,  time comp = , space = 
    // subarray: contiguous element, 



    // number of occurrences greater than n/k
    void printOccurrences(int[] arr, int k){
        int n = arr.length;
        // implement hashmap, arr[i]->occurrences
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el: arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if(m.getValue()>n/k){
                System.out.println(m.getKey());
            }
        }
    }
}

/*
Working in Search team and algorithm squad
Key responsibilities:
1. Work in Tokopedia which is Indonesia's leading E-commerce company and to solve the ranking of products so that Tokopedia can easily provide the fast and cheap deliverable products to their customers and as we know that Indonesia has 17000+ Islands and the major problem is delivery there because delivery is not possible via road.
2. I manage the ranking of products eg. write logic to boost and de-boost their scores based on performances, ratings, reviews and best match scores.
3. I manage the ETL process of products which is required to calculate the other parameters required for ranking like: shop scores and product cancellation scores
4. Write logic in 1 microservice which is "Ace" to implement and manage the Query Time Boosters that generate queries according to the search request
5. Manage caching of products and its scores in Redis and Cassandra(now it is migrated to Yugabyte CQL)
6. Manage queue based system in 1 microservice which is "Minerva" to calculate the Index Time Boosters and then publish the NSQ msgs to update the ElasticSearch docs.
7. Manage Real Time Booster logics in "SearchTrafficController" microservice to boost products based on their real time impressions using Cron Jobs at every 4 PM and 4 AM


 */

class Solution{
    public int firstMissing(int[] nums){
        // data processing
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]<=0 || nums[i]>=n+1){ // to process the unrequired data
                nums[i] = n+1;
            }
        }
        // mark visited element
        for(int i=0; i<n; i++){
            int element = Math.abs(nums[i]);
            if(element==n+1){ // ignore processed element
                continue;
            }
            int index = element-1;
            if(nums[index]>0){
                nums[index] = -nums[index]; // mark visited
            }

        }
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}