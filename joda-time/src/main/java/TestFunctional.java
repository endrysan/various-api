import org.joda.time.DateTime;
import org.joda.time.Interval;

import java.util.List;

public class TestFunctional {

    private static TestFunctional instance;

    private TestFunctional(){}

    public static TestFunctional getInstance() {
        if (instance == null) {
            instance = new TestFunctional();
        }
        return instance;
    }

    public void someOutJodaTimeFunction() {
        DateTime firstDate = DateTime.now();
        DateTime secondDate = firstDate.plusHours(480);
        System.out.println(secondDate);
    }

    private static int getNumberOfDaysOverlapping(Interval currentInterval, List<DateTime> weekends) {
        int i = 0;
        for (DateTime day: weekends) {
            if (currentInterval.contains(day)) {
                i++;
            }
        }
        return i;
    }
}
