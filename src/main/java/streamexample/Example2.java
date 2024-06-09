package streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        // Given list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        String result = names.stream().collect(Collectors.joining(","));
        String result2 = String.join("-", names);
        System.out.println(result);
        System.out.println(result2);
    }
}
