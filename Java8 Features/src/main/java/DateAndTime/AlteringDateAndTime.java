package DateAndTime;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class AlteringDateAndTime {
    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = ldt1.plusDays(5);

        System.out.println(ldt2);
        System.out.println(ldt1.plusHours(10));
        System.out.println(ldt1.plusWeeks(2));

        //with months
        LocalDateTime ldt3 = ldt1.withMonth(7);
        System.out.println(ldt3);

        //with day of Month
        System.out.println(ldt1.withDayOfMonth(28));

        LocalDateTime plus = ldt1.plus(Period.ofDays(4));
        System.out.println(plus);

        LocalDateTime plus1 = ldt1.minus(Duration.ofHours(12));
        System.out.println(plus1);
    }
}
