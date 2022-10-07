package main.chapter5_Methods;

public class Gorilla {
    public static int count;
    public int total;
//    public static double average = total / count; // DOES NOT COMPILE

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
//        babyGorilla(); // DOES NOT COMPILE
    }
}
