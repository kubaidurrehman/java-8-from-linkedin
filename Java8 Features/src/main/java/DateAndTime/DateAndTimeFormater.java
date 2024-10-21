package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormater {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        String format = ldt.format(DateTimeFormatter.ISO_DATE);//can take different format
        System.out.println(format);

        //Custom format

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dateTimeFormatter.format(ldt));

    }
}
