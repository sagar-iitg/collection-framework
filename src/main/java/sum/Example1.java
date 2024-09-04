package sum;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Example1 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println(average);


        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max);

        int[] arr1={-1};
        int min = Arrays.stream(arr1).min().getAsInt();
        System.out.println(min);
        int min1 = Arrays.stream(arr).min().orElse(8);
        System.out.println(min1);

    }
}
