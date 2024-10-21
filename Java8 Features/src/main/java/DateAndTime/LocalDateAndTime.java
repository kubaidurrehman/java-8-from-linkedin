package DateAndTime;

import java.time.*;

//How to use local date and time
public class LocalDateAndTime {

    public static void main(String[] args) {

        //Date
        LocalDate ld1 = LocalDate.now();
        System.out.println("ld1 : "+ ld1);

        LocalDate ld2 = LocalDate.of(1995,7,28);
        System.out.println("ld2 : " +ld2);

        LocalDate ld3 = LocalDate.of(2024, Month.JULY,28);
        System.out.println("ld3 : " +ld3);

        LocalDate ld4 = LocalDate.ofYearDay(1995,209);
        System.out.println("ld4 : "+ ld4);

        //Time
        LocalTime lt1 = LocalTime.now();
        System.out.println("lt1 : "+ lt1);

        LocalTime lt2 = LocalTime.of(4,50);
        System.out.println("lt2 : "+ lt2);

        LocalTime lt3 = LocalTime.of(10,54,10);
        System.out.println("lt3 : "+ lt3);

        LocalTime lt4 = LocalTime.of(10,54,10,100);
        System.out.println("lt4 : "+ lt4);

       // Date And Time
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("ldt1 : " + ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2024,10,18,12,50,10);
        System.out.println("ldt2 : " + ldt2);

        LocalDateTime ldt3 = LocalDateTime.of(ld3, lt3);;
        System.out.println("ldt3 : " + ldt3);

        //MonthDay
        Month month = Month.JUNE;
        System.out.println("month : " +month);

        MonthDay monthDay = MonthDay.now();
        System.out.println("monthDay : "+ monthDay);

        MonthDay monthDay2 = MonthDay.of(10,25);
        System.out.println("monthDay2 : "+ monthDay2);

        LocalDate localDate = monthDay.atYear(2024);
        System.out.println("localDate : "+ localDate);
    }
}
