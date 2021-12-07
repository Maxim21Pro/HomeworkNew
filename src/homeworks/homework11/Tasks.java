package homeworks.homework11;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Tasks {

    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        LocalDate dateNew = LocalDate.of(2020, 6, 25);
        System.out.println(dateNew);
        Period period = Period.between(dateNew, dateNow);
        System.out.println(period);
        Duration duration = Duration.between(dateNew.atStartOfDay(), dateNow.atStartOfDay());
        System.out.println(duration.toDays());
        Duration duration1 = Duration.between(dateNew.atTime(0, 0, 0), dateNow.atTime(0, 0, 0));
        System.out.println(duration1.toSeconds());
    }
}
