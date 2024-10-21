package DateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodClass {
    public static void main(String[] args) {
        Period period = Period.of(2022, 10, 21);
        System.out.println("period : " + period);
        Period period1 = Period.ofDays(10);
        System.out.println(period1);

        //Duration is used for time difference
        LocalDateTime ldt1 = LocalDateTime.of(2011,11,14,17,40);
        LocalDateTime ldt2 = LocalDateTime.now();

        Duration between = Duration.between(ldt1, ldt2);
        System.out.println(between);

        //Period is used for Date Difference

        LocalDate ld1 = LocalDate.of(2021,4,15);
        LocalDate ld2 = LocalDate.now();
        Period between1 = Period.between(ld1, ld2);
        System.out.println(between1);

        //Difference in days
        long between2 = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(between2);

        //Duration
        Duration d1 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println("Duration : "+d1);

        Duration d2 = Duration.ofHours(14);
        System.out.println(d2);

        LocalTime l1 = LocalTime.of(10,20);
        LocalTime l2 = LocalTime.now();

        Duration d3 = Duration.between(l1,l2);
        System.out.println(d3);

    }
}
