package main.chapter5;

public class MantaRay {
    private String name = "Sammy";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.print(name);
    }

    public static void main(String args[]) {
        first();
        second();
//        third(); // DOES NOT COMPILE, т.к. нужно создать объект
    }
}
