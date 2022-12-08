package main.tests.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List list = new ArrayList(List.of("A", "B"));

        String[] array1 = {"C"};
        System.out.println(Arrays.toString(array1));   // [C]

        String[] array2 = (String[]) list.toArray(array1);
        System.out.println(Arrays.toString(array2));   // [A, B]

        array1[0] = "D";

        System.out.println(Arrays.toString(array1));   // [D]
        System.out.println(Arrays.toString(array2));   // [A, B]
    }
}
