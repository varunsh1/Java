import java.util.*;
import java.util.stream.Stream;
public class Streams1 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,4,1,2,8,2);
        Stream<Integer> s = l.stream();
        s.forEach(n->System.out.println(n));
        long c = l.stream().count();
        System.out.println("Number of element in stream is = "+c);
    }  
}
