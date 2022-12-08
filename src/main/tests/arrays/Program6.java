package main.tests.arrays;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        String[] strings1 = {"a", "b", "c", "d", "e"};
        String[] strings2 = Arrays.copyOfRange(strings1, 1, 3); // копирует элементы с 1 по 2 индекс, т.е. по 3 невключительно!
        System.out.println(Arrays.toString(strings2));

    }
}

