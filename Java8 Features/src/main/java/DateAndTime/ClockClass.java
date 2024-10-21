package DateAndTime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class ClockClass {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        Instant instant = clock.instant();
        System.out.println(instant);

        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());

        Clock offset = Clock.offset(clock1, Duration.ofHours(10));
        System.out.println(offset.instant());
    }
}
