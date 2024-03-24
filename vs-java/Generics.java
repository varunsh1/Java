import java.util.ArrayList;
import java.util.HashSet;

class GenericExample<T1, T2>{ // Generic class having T1 and T2 types
    private T1 t1; // generic class variables can be of any type
    private T2 t2;
    public void setT1(T1 t1){
        this.t1 = t1;
    }
    public T1 getT1(){
        return this.t1;
    }
    public void setT2(T2 t2){
        this.t2 = t2;
    }
    public T2 getT2(){
        return this.t2;
    }
}

class GenericsExample2<T1>{
    private T1 t1;

    public void set(T1 t1){
        this.t1 = t1;
    }
}

interface Example{
    void print();
}
public class Generics {
    public static void main(String[] args) {
        GenericExample<String, Integer> n1 = new GenericExample<>();
        n1.setT1("Hi, how are you?");
        String a = n1.getT1();
        n1.setT2(10);
        int b = n1.getT2();
        System.out.println(a + b);
        GenericsExample2<Integer> as = new GenericsExample2<>();
        as.set(10);
        HashSet<Integer> hset = new HashSet<>();
        int[] arr= {1,2,3,4,5};
        int m=5, n=5;
        for(int i=0; i<n; i++){
            hset.add(arr[i]);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int j=0; j<m; j++){
            if(hset.remove(arr[j])){
                l.add(arr[j]);
            }
        }
        int [] a = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i); // Auto-unboxing Integer to int
        }
        return a;

        
    }
}
