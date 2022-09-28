package main.chapter7.Enums._1_Creating_Simple_Enums;

/**
 * Calling the values(), name(), and ordinal() Methods
 */

public class Test {
    public static void main(String[] args) {
        var s = Season.SUMMER;
        System.out.println(Season.SUMMER); // SUMMER
        System.out.println(s == Season.SUMMER); // true

        System.out.println();

        for (var season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        System.out.println();

        Season s1 = Season.valueOf("SUMMER");
        System.out.println(s1);                     // SUMMER
//        Season t = Season.valueOf("summer");  // IllegalArgumentException

        System.out.println();

        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.print("Get out the sled!");
                break;
            case SUMMER:
                System.out.print("Time for the pool!");
                break;
            default:
                System.out.print("Is it summer yet?");
        }

        System.out.println();

//        var message = switch (summer) {
//            case Season.WINTER -> "Get out the sled!"; // DOES NOT COMPILE
//            case 0 -> "Time for the pool!";            // DOES NOT COMPILE
//            default -> "Is it summer yet?";
//        };



    }
}
