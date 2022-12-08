package main.tests.strings;

import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        String string1 = String.join("-", "a", "b");
        System.out.println(string1);        // a-b

        String string2 = String.join("-", "a");
        System.out.println(string2);        // a

//      String string3 = String.join("-",{"a","b"});  // not compiled, не хватает new String[]
//      System.out.println(string3);

        String string4 = String.join("-", new String[]{"a", "b"});
        System.out.println(string4);        // a-b

        String string5 = String.join("-", List.of("a", "b"));
        System.out.println(string5);        // a-b

        String string6 = String.join("-", new StringBuilder("a"), new StringBuilder("b"));
        System.out.println(string6);        // a-b

        System.out.println("___________________");

        StringBuilder builder1 = new StringBuilder("Hello"); // length = 5
        int cap1 = builder1.capacity();  // добавляет 16 к длине
        System.out.println(cap1);        // 21

        StringBuilder builder2 = new StringBuilder(21); // length = 21
        int cap2 = builder2.capacity();  // 21
        System.out.println(cap2);        // 21

        System.out.println(cap1 == cap2); // true
    }
}
