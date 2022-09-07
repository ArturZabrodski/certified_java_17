package main.chapter4;

import java.time.LocalDate;

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

    }
}
