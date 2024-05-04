package primitive;

import java.util.Arrays;
import java.util.OptionalInt;

public class Exmaple {


    public static void main(String[] args) {
        int[] arr={1,10,9,5,4,3,2,0,-3};

        OptionalInt maxInArray= Arrays.stream(arr).max();
        int max=Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);

        System.out.println(max);

        System.out.println(maxInArray);
        int min=Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        System.out.println(min);



    }

}
