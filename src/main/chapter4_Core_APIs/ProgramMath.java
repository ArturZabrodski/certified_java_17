package main.chapter4_Core_APIs;

import java.util.Random;

public class ProgramMath {
    public static void main(String[] args) {

        // min & max
        int first = Math.max(3, 7); // 7
        int second = Math.min(7, -9); // -9

        // Rounding Numbers
        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); // 123

        // Determining the Ceiling and Floor
        /**
         * Метод ceil() принимает двойное значение. Если это целое число, оно возвращает то же значение.
         * Если оно имеет какое-либо дробное значение, оно округляется до следующего целого числа.
         * В отличие от этого, метод floor() отбрасывает все значения после десятичной дроби.
         */
        double c = Math.ceil(3.14);  // 4.0
        double f = Math.floor(3.14); // 3.0

        // Calculating Exponents
        double squared = Math.pow(5, 2); // 5^2 = 25.0

        // Generating Random Numbers
        double num = Math.random();
        System.out.println(num);  // от 0 до 1

        // class Random()
        var random = new Random();
        System.out.println(random.nextInt(11) - 10);  // от -10 до 10
        System.out.println(random.nextInt(11) + 1);  // от 1 до 10
    }
}
