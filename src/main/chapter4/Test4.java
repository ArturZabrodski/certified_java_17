package main.chapter4;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test4 {
    public static void main(String[] args) {
//        double one = Math.pow(1, 2);
//        int two = (int) Math.round(1.0);
//        float three = (float) Math.random();
//        var doubles = new double[]{one, two, three};

        int one = Math.min(5, 3);
        long two = Math.round(5.5);
        double three = Math.floor(6.6);
        var doubles = new double[]{one, two, three};


        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(builder.charAt(4));
        System.out.println(builder.replace(2, 4, "6").charAt(3));
        System.out.println(builder.replace(2, 5, "6").charAt(2));
//        System.out.println(string.charAt(5));     // exception
//        System.out.println(string.length);        // does not compiled
        System.out.println(string.replace("123", "1").charAt(2));

        var date = LocalDate.of(2022, 4, 3);
        date.plusDays(2);
//        date.plusHours(3);  // does not compiled
        System.out.println(date.getYear() + " " + date.getMonth()
                + " " + date.getDayOfMonth());

        String str = "text".indent(2);  // "  text"
        System.out.println(str);
        str = str.indent(-2);           // "text"
        System.out.println(str);

        char a1 = 'a';
        char b1 = 'b';
        char a2 = 'A';
        char b2 = 'B';

        if (a1 > b1) {                      // <
            System.out.println(">");
        } else System.out.println("<");

        if (a2 > b2) {                      // <
            System.out.println(">");
        } else System.out.println("<");

        if (a1 > a2) {                      // >
            System.out.println(">");
        } else System.out.println("<");

        var builder1 = new StringBuilder("String");
        builder1.append("builder");
        System.out.println(builder1);

        var dateTime = LocalDateTime.now();
        var zoneId = ZoneId.systemDefault();
        var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        Instant instant1 = Instant.now();
        Instant instant2 = zonedDateTime.toInstant();

        System.out.println(instant1);
        System.out.println(instant2);

        var base = "ewe\nsheep\\t";
        int length = base.length();               // 11
        int indent = base.indent(2).length();  // Добавляем по 2 символа в каждую строку и переход на новую строку как 1 символ, т.е. +5
        System.out.println(base.translateEscapes());       // \t - 1 символ и \n 1 - символ
        int translate = base.translateEscapes().length();  // 10
        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.format(formatted);

        System.out.println(base.substring(1, 1));  // пустая строка
//        System.out.println(base.substring(2,1));  // exception

        String s1 = """
                purr""";
        String s2 = "";
        s1.toUpperCase();   // ничего не происходит
        s1.trim();          // ничего не происходит
        s1.substring(1, 3); // ничего не происходит
        s1 += "two";
        s2 += 2;
        s2 += 'c';
        s2 += false;
        if (s2 == "2cfalse") System.out.println("==");
        if (s2.equals("2cfalse")) System.out.println("equals");
        System.out.println(s1.length());


        var date1 = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime1 = ZonedDateTime.of(date1, time, zone);
        var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
        long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int hour = dateTime2.getHour();
        boolean offset = dateTime1.getOffset()
                == dateTime2.getOffset();
        System.out.println("diff = " + diff);
        System.out.println("hour = " + hour);
        System.out.println("offset = " + offset);
    }
}
