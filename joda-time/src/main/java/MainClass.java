import org.joda.time.DateTime;
import org.joda.time.Interval;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        DateTime startDate = DateTime.now().minusDays(10);
        DateTime endDate = DateTime.now().plusDays(10);
        Interval someInterval = new Interval(startDate, endDate);
        System.out.println(someInterval);
        someInterval = someInterval.withEnd(someInterval.getEnd().plusDays(1));
        System.out.println(someInterval);
        List<DateTime> someList = Arrays.asList(DateTime.now(), DateTime.now().minusMonths(1), DateTime.now().plusMonths(1), DateTime.now().minusDays(10), DateTime.now().plusDays(10));
        int i = 0;
        for (DateTime day: someList) {
            if (someInterval.contains(day)) {
                i++;
            }
        }
        System.out.println(new DateTime(1466410025228L).toDate());
        System.out.println(i);
    }

}
