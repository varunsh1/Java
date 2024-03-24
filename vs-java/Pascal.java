import java.util.ArrayList;
import java.util.List;
public class Pascal {
    static List<List<Integer>> triangle(int n){
        List<List<Integer>> result = new ArrayList<>();
        if(n==0) return result;
        List<Integer> firstRow = new ArrayList<>(); // first row
        firstRow.add(1);
        result.add(firstRow);
        if(n==1) return result;
        for(int i=1; i<n; i++){ // starts with 2nd row
            List<Integer> prevRow = result.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1); // beginning element is 1 of each row
            for(int j=0; j<i-1; j++){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1); // last element is 1 of each row
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> p = new ArrayList<>();
        p = triangle(5);
        System.out.println(p);
    }
}
