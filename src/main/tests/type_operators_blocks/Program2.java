package main.tests.type_operators_blocks;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        double a = 1.25;
        a++;
        System.out.println(a); // 2.25


//        var result = 0;
        var result = 0.0;

        int i1 = 1;
        int i2 = 2;
        float i3 = i1++ + ++i2;
        result = (i1 + i2) / i3;  // должен быть инициализирован как дробный тип

        System.out.println(result); // 1.25

        int i = (i = 2) + (i = 1) + i * 3; // 2 + 1 + 1 * 3
        System.out.println(i);  // 3

    }
}
