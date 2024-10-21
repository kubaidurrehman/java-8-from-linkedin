package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalender {
    public static void main(String[] args) {
        /*
        Params:
        year – the year minus 1900.
        month – the month between 0-11.
        date – the day of the month between 1-31.
        */

        Date date = new Date(124,9,21);
        LocalDate date1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(date1);

        Calendar calendar = Calendar.getInstance();
        LocalDateTime dateTime = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(dateTime);
    }
}
