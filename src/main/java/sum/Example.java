package sum;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        List<Integer> list1=null;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        double avg = list.stream().
                mapToLong(Integer::longValue).
                average().
                orElseThrow(() -> new IllegalArgumentException("list ---null"));

        System.out.println(avg);
        long count = list.stream().count();
        System.out.println(count);

        Integer min =
                list.stream().min(Integer::compareTo).orElseThrow(NoSuchElementException::new);
        System.out.println(min);



    }
}
