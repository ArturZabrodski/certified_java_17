package main.chapter6_Class_Design._5_Inheriting_Members.Hiding_Static_Methods;

public class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}