package main.chapter10_Streams.other.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задача — найти сумму нечетных чисел в коллекции.
 */

public class Example {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        
        Integer odd = list.stream()
                .filter(p -> p % 2 != 0)      // проверяем элемент на четность
                .reduce((c1, c2) -> c1 + c2)  //
                .orElse(0);             //

        System.out.println(odd);

        Integer oldOdd = 0;
        for (Integer i : list) {
            if (i % 2 != 0) {
                oldOdd += i;
            }
        }

        System.out.println(oldOdd);
    }
}
