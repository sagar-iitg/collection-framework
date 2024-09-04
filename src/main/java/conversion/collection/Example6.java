package conversion.collection;

import java.util.*;

public class Example6 {
    public static void main(String[] args) {
        // Example List<List<Integer>>
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1, 2, 3));
        listOfLists.add(Arrays.asList(4, 5,6));
        listOfLists.add(Arrays.asList(6, 7, 8));

        // Convert List<List<Integer>> to int[][]
        int[][] array = listOfLists.stream()
            .map(list -> list.stream().mapToInt(Integer::intValue).toArray())  // Convert each List<Integer> to int[]
            .toArray(int[][]::new);  // Convert the Stream<int[]> to int[][]

        // Print the 2D array
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}