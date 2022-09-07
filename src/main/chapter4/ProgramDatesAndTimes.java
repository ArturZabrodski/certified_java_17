package main.chapter4;

import java.time.*; // import time classes
import java.time.temporal.ChronoUnit;

public class ProgramDatesAndTimes {
    public static void main(String[] args) {

        /**
         * LocalDate Содержит только дату — без времени и часового пояса. Хороший пример LocalDate - твой день рождения
         * в этом году. Это ваш день рождения на целый день, независимо от того, сколько сейчас времени.
         *
         * LocalTime Содержит только время — без даты и часового пояса. Хорошим примером
         * местного времени является полночь. Каждый день в одно и то же время наступает полночь.
         *
         * LocalDateTime Содержит как дату, так и время, но не часовой пояс. Хорошим примером
         * местного времени является “полночь в канун Нового года”. Полночь 2 января
         * это не так уж и важно, что делает дату относительно неважной, и очевидно, что час после
         * полуночи тоже не такой особенный.
         *
         * ZonedDateTime Содержит дату, время и часовой пояс. Хорошим примером
         * ZonedDateTime является “конференц-звонок в 9:00 утра по восточному времени”. Если вы живете в Калифорнии,
         * вам придется вставать очень рано, так как звонок в 6:00 утра по местному времени!
         */

        System.out.println(LocalDate.now());        // 2022-09-07
        System.out.println(LocalTime.now());        // 13:20:03.263946038
        System.out.println(LocalDateTime.now());    // 2022-09-07T13:20:03.264167683
        System.out.println(ZonedDateTime.now());    // 2022-09-07T13:20:03.265299994+03:00[Europe/Minsk]

        var date1 = LocalDate.of(2022, Month.JANUARY, 20);  // 2022-01-20
        var date2 = LocalDate.of(2022, 1, 20);        // 2022-01-20

        var time1 = LocalTime.of(6, 15);                             // hour and minute
        var time2 = LocalTime.of(6, 15, 30);                  // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        /**
         * Для того чтобы создать ZonedDateTime, нам сначала нужно получить желаемый часовой пояс.
         */

        var zone = ZoneId.of("US/Eastern");

        var zoned1 = ZonedDateTime.of(2022, 9, 7,
                13, 31, 30, 200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);

        var zone1 = ZoneId.of("Europe/Minsk");
        var zoned4 = ZonedDateTime.of(2022, 9, 7,
                13, 31, 30, 200, zone1);

        System.out.println(zoned1.equals(zoned4)); // false

        /**
         *  основные, которые необходимо знать
         *         public static ZonedDateTime of (int year, int month, int dayOfMonth, int hour,
         *                                         int minute, int second, int nanos, ZoneId zone)
         *         public static ZonedDateTime of (LocalDate date, LocalTime time, ZoneId zone)
         *         public static ZonedDateTime of (LocalDateTime dateTime, ZoneId zone)
         */

//        var d = new LocalDate(); // DOES NOT COMPILE
//        var d = LocalDate.of(2022, Month.JANUARY, 32); // DateTimeException (количество дней)

// Manipulating Dates and Times
        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date); // 2022–01–20
        date = date.plusDays(2);
        System.out.println(date); // 2022–01–22
        date = date.plusWeeks(1);
        System.out.println(date); // 2022–01–29
        date = date.plusMonths(1);
        System.out.println(date); // 2022–02–28
        date = date.plusYears(5);
        System.out.println(date); // 2027–02–28
        date = date.plusDays(1);
        System.out.println(date); // 2027–03–01


        date = LocalDate.of(2024, Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2024–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2024–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2024–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2024–01–18T19:14:30

        date = LocalDate.of(2024, Month.JANUARY, 20);
        time = LocalTime.of(5, 15);
        dateTime = LocalDateTime.of(date, time)
                .minusDays(1).minusHours(10).minusSeconds(30);

        date = LocalDate.of(2024, Month.JANUARY, 20);
        date.plusDays(10);  // в данном случае ничего не добавляется
        System.out.println(date);

        date = LocalDate.of(2024, Month.JANUARY, 20);
//        date = date.plusMinutes(1); // DOES NOT COMPILE, т.к. работаем с LocalDate, а не с LocalTime

// Working with Periods
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        var period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);


        var annually = Period.ofYears(1); // every 1 year
        var quarterly = Period.ofMonths(3); // every 3 months
        var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        var everyOtherDay = Period.ofDays(2); // every 2 days
        var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

//        var wrong = Period.ofYears(1).ofWeeks(1); // every week
        var wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(1);

        System.out.println(date);
        System.out.println(date.plus(wrong));

        System.out.println(Period.ofMonths(3)); // P3M


        date = LocalDate.of(2022, 1, 20);
        time = LocalTime.of(6, 15);
        dateTime = LocalDateTime.of(date, time);
        period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2022–02–20
        System.out.println(dateTime.plus(period)); // 2022–02–20T06:15
//        System.out.println(time.plus(period)); // Exception

// Working with Durations
        var daily = Duration.ofDays(1); // PT24H
        var hourly = Duration.ofHours(1); // PT1H
        var everyMinute = Duration.ofMinutes(1); // PT1M
        var everyTenSeconds = Duration.ofSeconds(10); // PT10S
        var everyMilli = Duration.ofMillis(1); // PT0.001S
        var everyNano = Duration.ofNanos(1); // PT0.000000001S

        // аналогично
        daily = Duration.of(1, ChronoUnit.DAYS);
        hourly = Duration.of(1, ChronoUnit.HOURS);
        everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        everyNano = Duration.of(1, ChronoUnit.NANOS);

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);
        System.out.println();

        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 30);
        date = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two));      // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two));    // 75
//        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

        // truncatedTo()
        LocalTime time11 = LocalTime.of(3, 12, 45);
        System.out.println(time11); // 03:12:45
        LocalTime truncated = time11.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated); // 03:12


        date = LocalDate.of(2022, 1, 20);
        time = LocalTime.of(6, 15);
        dateTime = LocalDateTime.of(date, time);
        var duration = Duration.ofHours(6);
        System.out.println(dateTime);                // 2022-01-20T06:15
        System.out.println(dateTime.plus(duration)); // 2022–01–20T12:15
        System.out.println(time);                    // 06:15
        System.out.println(time.plus(duration));     // 12:15
//        System.out.println(date.plus(duration));   // UnsupportedTemporalTypeException, т.к. не содержит time

        /**
         * Period используется с LocalDate, LocalDateTime, ZonedDateTime
         * Duration используется с LocalTime, LocalDateTime, ZonedDateTime
         */

        System.out.println();

// Working with Instants
        var now = Instant.now();
// do something time-consuming
        var later = Instant.now();
        duration = Duration.between(now, later);
        System.out.println(duration.toMillis()); // Returns number milliseconds

        date = LocalDate.of(2022, 5, 25);
        time = LocalTime.of(11, 55, 00);
        zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date, time, zone);
        var instant = zonedDateTime.toInstant(); // 2022–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2022–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 2022–05–25T15:55:00Z
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while (upTo.isBefore(end)) {        // check if still before end
            System.out.println("give new toy: " + upTo);
//            upTo = upTo.plusMonths(1);    // add a month
            upTo = upTo.plus(period);       // adds the period
        }
    }
}
