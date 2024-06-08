package sum;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Stats {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        IntSummaryStatistics intSummaryStatistics = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(  intSummaryStatistics.toString());


    }

}
