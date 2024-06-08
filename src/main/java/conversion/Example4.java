package conversion;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        // Example int[] array
        int[] intArray = {1, 12, 33, -4, 5,24,5,6,7,8,122,90,-23};

        // Convert int[] array to List<Integer>
        List<Integer> integerList = Arrays.stream(intArray).boxed().toList();

        System.out.println(integerList);


        // Convert int[] array to HashSet<Integer> using stream
        Set<Integer> integerSet = Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.toSet());




        System.out.println(integerSet);
        LinkedHashSet<Integer> integerLinkedHashSet = Arrays.stream(intArray).
                boxed().
                collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(integerLinkedHashSet);

    }
}
