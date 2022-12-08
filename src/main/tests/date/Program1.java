package main.tests.date;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Program1 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.of(10,10,10);
        LocalTime start = LocalTime.of(8,30).withMinute(now.getMinute());  // 8:10, минуты берем такие же как у переменной now
        LocalTime end = LocalTime.of(12,30).withMinute(now.getMinute());   // 12:10, минуты берем такие же как у переменной now

        long timePassed = now.until(start, ChronoUnit.HOURS);  // вычисляет время в часах до начала,
        long timeToGo = now.until(end, ChronoUnit.HOURS);      // либо после начала события (now)

        System.out.println(timePassed); // -2
        System.out.println(timeToGo);   // 1
    }
}
