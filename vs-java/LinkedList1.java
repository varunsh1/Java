import java.util.*;
public class LinkedList1{
    public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    l1.add(10);
    l1.add(15);
    l1.add(12);
    Collections.sort(l1);
    System.out.println("list sorted="+l1);
    Collections.reverse(l1);
    System.out.println("LinkedList="+l1);
    for(int i=0;i<l1.size();i++){
        System.out.println(l1.get(i));
    }
    l1.addLast(15);
    l1.addFirst(9);
    System.out.println("LinkedList="+l1);
    // l1.remove(); it removes first index element
    l1.remove(3);
    System.out.println("LinkedList="+l1);
    LinkedList<Integer> l2 = new LinkedList<>();
    l2.add(1);
    l2.add(2);
    l2.add(3);
    l1.addAll(l2);
    System.out.println("l2="+l2);
    System.out.println("LinkedList1="+l1);
    l1.remove(4);
    l1.add(12);
    System.out.println("LinkedList1="+l1);
    System.out.println("contains linkedlist2"+l1.containsAll(l2));
    List<List<String>> listOfLists = new ArrayList<>();
    List<String> innerList1 = new ArrayList<>();
    innerList1.add("A");
    innerList1.add("B");
    innerList1.add("C");
    innerList1.add("D");
    List<String> innerList2 = new ArrayList<>();
    innerList2.add("X");
    innerList2.add("Y");
    innerList2.add("Z");
    listOfLists.add(innerList1);
    System.out.println("listoflists1="+listOfLists);
    listOfLists.add(innerList2);
    System.out.println("listoflists2="+listOfLists);
    for(List innerlist : listOfLists)
    {
        for(Object i : innerlist)
        {
            System.out.print( i+ " ");
        }
        System.out.println("");
    }

    listOfLists.forEach((list) -> {
        list.forEach((num) -> System.out.println(num));
    });
    // List<List<List<String>>> list3= new ArrayList<>();

    } 
}

