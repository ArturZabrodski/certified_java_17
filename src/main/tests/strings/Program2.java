package main.tests.strings;

public class Program2 {
    public static void main(String[] args) {
        String string = "Hey";
        StringBuilder builder = new StringBuilder(string);

        System.out.println(string.equals(builder));         // false
        System.out.println(string.contentEquals(builder));  // true


        String str = "Hello" + " " + "World"; // создан 1 объект

        System.out.println("_________________");

        String str1 = null;
        String str2 = str1 + str1; // nullnull

//      String str3 = str1.concat(str1); // NullPointerException

        System.out.println("_________________");

        String str4 = "HeLlo";
        System.out.println(str4.indexOf('l')); // 3, выводит номер первого встречающегося символа l, иначе -1
        System.out.println(str4.indexOf('L')); // 2, выводит номер первого встречающегося символа L, иначе -1
        System.out.println(str4.indexOf('l',3)); // 3, выводит номер первого встречающегося символа L до 3 сивола включительно


    }
}
