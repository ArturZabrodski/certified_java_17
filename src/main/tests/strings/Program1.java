package main.tests.strings;

public class Program1 {
    static String text;

    public static void main(String[] args) {
        System.out.println(text); // null

        String string1 = text + "Java";
        String string2 = "Java";

        System.out.println(string1); // nullJava
        System.out.println(string1 == string2);       // false
        System.out.println(string1.equals(string2));  // false


        String string3 = "Java";

        System.out.println(string2 == string3);       // true
        System.out.println(string2.equals(string3));  // true


        String string4 = new String("Java");

        System.out.println(string2 == string4);       // false
        System.out.println(string2.equals(string4));  // true
    }
}
