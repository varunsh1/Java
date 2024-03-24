import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Stream {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 1, 2, 8, 64, 0);
        Stream<Integer> s = l.stream();
        s.forEach(n -> System.out.println(n));
    }
}
