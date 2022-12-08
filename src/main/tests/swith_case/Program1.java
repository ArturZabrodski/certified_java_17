package main.tests.swith_case;

public class Program1 {
    public static void main(String[] args) {

        String n = "B";

        switch (n) {
            case "A":
            case "a":
                System.out.println("Apple");
            case "B":
                System.out.println("Beef");      // 1
            default:
                System.out.println("No match");  // 2
        }
    }
}
