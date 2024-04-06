package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    public MyHash(int BUCKET) {
        this.BUCKET = BUCKET;
        table = new ArrayList<>();
        for(int i=0; i<BUCKET; i++){
            table.add(new LinkedList<>());
        }
    }
    void insert(Integer el){
        int index = el%BUCKET;
        table.get(index).add(el);
    }

    void delete(Integer el){
        int index = el%BUCKET;
        table.get(index).remove(el);
    }

    boolean search(Integer el){
        int index = el%BUCKET;
        return table.get(index).contains(el);
    }
}

public class Chaining{
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(10);
        mh.insert(20);
        mh.insert(30);
        mh.insert(7);
        mh.insert(8);


        System.out.println("10 exists = "+ mh.search(10));
        mh.delete(20);
        mh.delete(10);
        System.out.println("20 exists = "+ mh.search(20));
        System.out.println(mh.toString());

    }
}