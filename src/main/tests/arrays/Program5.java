package main.tests.arrays;

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        String[] array1 = {"hi", "hey", "hello"};
        Object[] array2 = {"hey", "hello"};

        // сравниваем массивы по индекса с 1 по 3 не включительно и с 0 по 2 не включительно
        boolean isEqual = Arrays.equals(array1, 1, 3, array2, 0, 2);
        System.out.println(isEqual);
    }
}
