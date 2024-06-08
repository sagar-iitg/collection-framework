package conversion;


import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        // Example Set<Integer>
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);

        // Convert Set<Integer> to int[]
        int[] intArray = integerSet.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(intArray));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        // Convert List<Integer> to int[]
        int[] intArray1 = integerList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(intArray1));



    }
}

