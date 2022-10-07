package main.chapter3_Making_Decisions;

public class Program {
    public static void main(String[] args) {

        // in java, numeric values are not considered logical
        int hourOfDay = 1;
//        if(hourOfDay) {    // DOES NOT COMPILE
//            System.out.println(hourOfDay);
//        }

        // проверяет была ли переменная создана с помощью класса
        Integer i = 5;
        System.out.println(i instanceof Integer);

        printIntegersGreaterThan5(i);

        Integer value = 123;
        if (value instanceof Integer) {
        }
//        if(value instanceof Integer data) {} // DOES NOT COMPILE


        int month = 5;

//        switch month { // DOES NOT COMPILE
//            case 1: System.out.print("January");
//        }
//        switch(month) // DOES NOT COMPILE
//        case 1: System.out.print("January");
//        switch(month) {
//            case 1: 2: System.out.print("January"); // DOES NOT COMPILE
//        }


// SWITCH

        switch (month) {
        } // COMPILE


        final int bananas = 1;
        int number = 3;
        switch (number) {
            // переменная может быть только final
            case bananas:
                System.out.println("bananas");
            case 2:
                System.out.println("apples");
            case 3:
                System.out.println("cookies");
            case 3 * 5:
                System.out.println("3 * 5");
        }

        switch (month) {
            case 1, 2, 3 -> System.out.print("Winter");
            case 4, 5, 6 -> System.out.print("Spring");
            case 7, 8, 9 -> System.out.print("Summer");
            case 10, 11, 12 -> System.out.print("Fall");
        }


        int bear = 7;

        var result = switch (bear) {
            case 30 -> "Grizzly";
            default -> "Panda";
        };

        System.out.println(result);


        int measurement = 10;
        int size = switch (measurement) {
            case 5 -> 1;
            case 10 -> (short) 2;
            default -> 5;
//            case 20 -> "3"; // DOES NOT COMPILE
//            case 40 -> 4L; // DOES NOT COMPILE
//            case 50 -> null; // DOES NOT COMPILE
        };

        int x = 0;
        for (x = 0; x < 5; x++)
            System.out.print(x + " ");

        System.out.println();
    }

    static void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.print(data);
        else System.out.println("null");
    }

    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        // не находиться в области видимости
//        System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        // не находится в области видимости, но выполняется return
        System.out.print(data.intValue());
    }

    void printOnlyIntegers1(Number number) {
        if (!(number instanceof Integer data))
            return;
        else
            System.out.print(data.intValue());
    }

    void printOnlyIntegers2(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        else
            return;
    }

    public void printDayOfWeek(int day) {
        if (day == 0)
            System.out.print("Sunday");
        else if (day == 1)
            System.out.print("Monday");
        else if (day == 2)
            System.out.print("Tuesday");
        else if (day == 3)
            System.out.print("Wednesday");

    }

    final int getCookie() {
        return 4;
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
//        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
//            case apples: // DOES NOT COMPILE
                // метод в case нельзя прописывать
//            case getCookies(): // DOES NOT COMPILE
//            case cookies: // DOES NOT COMPILE
            case 3 * 5:
        }
    }

    enum Season {WINTER, SPRING, SUMMER, FALL}

    String getWeather(Season value) {
        return switch (value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}
