package main.tests.strings;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        String text = "ab";
        text = text.repeat(3); // ababab, повторили 1 + 2 раза
        System.out.println(text);

        text = text.replace('a', 'c');
        text = text.replace("b", "d");
        System.out.println(text);

        System.out.println("_______________");

        String[] strings = {"b", "c", "a", "d", "e"};
        Arrays.sort(strings, 1, 3);  // сортирует элементы с 1 по 3 не включительно
        System.out.println(Arrays.toString(strings));

        System.out.println("_______________");

        String[] array1 = {"1", "2", "3"};  // [1, 2, 3]
        String[] array2 = {};               // []
        String[] array3 = null;             // null

        Object o1 = Arrays.compare(array1, array2);
        Object o2 = Arrays.compare(array2, array3);
        Object o3 = Arrays.compare(array3, array1);
        System.out.println(o1 + " " + o2 + " " + o3);  // 3 1 -1
    }
}
