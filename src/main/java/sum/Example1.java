package sum;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Example1 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println(average);

    }
}
