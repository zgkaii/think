package org.zgkaii.java8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/28 13:36
 * @Description: Clock、Timezones、LocalTime
 **/
public class DateApiTest {
    public static void main(String[] args) {
        // Clock类提供了访问当前日期和时间的方法
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);
        // 某一个特定的时间点也可以使用Instant类来表示
        Instant instant = clock.instant();
        System.out.println(instant);
        // Instant类也可以用来创建旧版本的java.util.Date对象
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);

        //输出所有区域标识符
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());// ZoneRules[currentStandardOffset=+01:00]
        System.out.println(zone2.getRules());// ZoneRules[currentStandardOffset=-03:00]

        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println(now1.isBefore(now2));  // false

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);       // -4
        System.out.println(minutesBetween);     // -299

        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late);       // 23:59:59
        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedTime(FormatStyle.SHORT)
                        .withLocale(Locale.GERMAN);

        LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
        System.out.println(leetTime);   // 13:37
    }
}
