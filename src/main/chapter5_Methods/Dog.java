package main.chapter5_Methods;

// Passing Objects

public class Dog {
    public static void main(String[] args) {
        String name = "Webby";
        var name1 = new StringBuilder("Webby");

        speak(name);
        System.out.println(name);  // Webby

        speak(name1);
        System.out.println(name1);  // WebbyGeorgette
    }

    public static void speak(String name) {
        name = "Georgette";
    }

    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }
}