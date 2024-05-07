package streamexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {


    public static void main(String[] args) {
        String[] str={"abc","abcd","sagar","hello","sky"};


         Arrays.stream(str)
                .filter(s -> s.length() == 3).forEach(System.out::println);

        List<String > stringList=new ArrayList<>(List.of("abc","abcd","sagar","hello","sky"));


        StringBuilder collect = stringList.stream().
                                            filter(s -> s.length() == 3).
                                            collect(() -> new StringBuilder(), (sb, s) -> sb.append(s),
                         (sb1, sb2) -> sb1.append(sb2));

        StringBuilder collect1 = stringList.stream().filter(s -> s.length() == 3).
                collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

        System.out.println(collect);
        System.out.println(collect1);


    }
}
