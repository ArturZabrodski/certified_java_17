package main.chapter5;

import java.sql.SQLOutput;

public class ProgramLocalVariableModifiers {
    public static void main(String[] args) {
        boolean isWeekend = true;
        final int rest;

        if (isWeekend) rest = 5;
        else rest = 20;

        System.out.println(rest); // compile


//        if (isWeekend) rest = 5;
//        System.out.println(rest); // does not compile, т.к не присвоено значение значение


//        final var giraffe = new Animal();
        final int[] friends = new int[5];
//        rest = 10; // DOES NOT COMPILE
//        giraffe = new Animal(); // DOES NOT COMPILE
//        friends = null; // DOES NOT COMPILE

// Instance Variable Modifiers
        /**
         * final Указывает, что переменная экземпляра должна быть инициализирована с
         * каждым экземпляром класса ровно один раз
         *
         * volatile Инструктирует JVM, что значение в этой переменной может быть
         * изменено другими потоками
         *
         * transient Используется для указания на то, что переменная экземпляра не должна быть
         * сериализована вместе с классом
         */

        run(11, 77); // 77

        walkDog(1); // 0
        walkDog(1, 2); // 1
        walkDog(1, 2, 3); // 2
        walkDog(1, new int[]{4, 5}); // 2


// Autoboxing and Unboxing Variables
        int quack = 5;
        Integer quackquack = Integer.valueOf(quack); // Convert int to Integer
        int quackquackquack = quackquack.intValue(); // Convert Integer to int

        int quack1 = 5;
        Integer quackquack1 = quack1; // Autoboxing
        int quackquackquack1 = quackquack1; // Unboxing

        Short tail = 8; // Autoboxing
        Character p = Character.valueOf('p');
        char paw = p; // Unboxing
        Boolean nose = true; // Autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e; // Unboxing, then implicit casting

//        Long baldgorilla = 8; // DOES NOT COMPILE

        Character elephant = null;
//        char badElephant = elephant; // NullPointerException

// Autoboxing
        System.out.println(abc(8));
    }


    public static Integer abc(Integer n) {
        return n;
    }

//    public static int abc(int n) {
//        return n;
//    }

    /**
     * Varargs — или Variable Arguments — это технология, которая позволяет создавать методы
     * с произвольным количеством аргументов.
     */
    public void walk1(int... steps) {
    }

    public void walk2(int start, int... steps) {
    }
//    public void walk3(int... steps, int start) {} // DOES NOT COMPILE
//    public void walk4(int... start, int... steps) {} // DOES NOT COMPILE

    public static void run(int... steps) {
        System.out.print(steps[1]);
    }

    public static void walkDog(int start, int... steps) {
        System.out.println(steps.length);
    }
}
