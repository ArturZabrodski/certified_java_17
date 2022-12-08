package main.tests.arrays;

import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = Arrays.copyOf(array1,4); // создаем новый массив, с ипользованием array1 и размером 4 элемента

        System.out.println(Arrays.toString(array1)); // [1, 2, 3]
        System.out.println(Arrays.toString(array2)); // [1, 2, 3, 0]

        System.out.println(array2[3]);  // 0
    }
}
