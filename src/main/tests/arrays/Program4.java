package main.tests.arrays;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(null);
        System.out.println(list.get(0));

        Integer[] array1 = new Integer[1];
        int[] array2 = new int[1];
        System.out.println(array1[0] + " " + array2[0]);
    }
}
