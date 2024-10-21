package DateAndTime;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneDateAndTime {
    public static void main(String[] args) {
        for(String zoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId1 = ZoneId.of(zoneId);
            String zoneId1DisplayName =zoneId1.getDisplayName(TextStyle.FULL, Locale.US);
            System.out.println(zoneId+ " : "+zoneId1DisplayName);
        }

       // ZoneId  zoneId =  ZoneId.of("Etc/UTC");
        ZoneId  zoneId =  ZoneId.of("Africa/Cairo");
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, zoneId);
        System.out.println("Locat date and time : "+ldt);
        System.out.println("Zoned Date time : "+zonedDateTime);




        //examples

        System.out.println("SingapurZonedDateTime:" + ZonedDateTime.of(ldt, ZoneId.of("Singapore")));
        System.out.println("prcZonedDateTime:" + ZonedDateTime.of(ldt, ZoneId.of("PRC")));
        System.out.println("IndiaZonedDateTime:" + ZonedDateTime.of(ldt, ZoneId.of("Asia/Kolkata")));
        System.out.println("IranZonedDateTime:" + ZonedDateTime.of(ldt, ZoneId.of("Iran")));

    }
}
