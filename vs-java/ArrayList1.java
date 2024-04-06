import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public void setA(int a) {
        this.a = a;
    }

    private int a;

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,6,7);
         System.out.println("List = "+l);
        // we can use list forEach to iterate through the values
        l.forEach(n->System.out.print(n));

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        l1.add(0, 5);
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l1.addAll(l2);
        System.out.println("L1="+l1);
        l2.clear();   
        l1.remove(1);
        System.out.println("L1="+l1);
        
    }
}
