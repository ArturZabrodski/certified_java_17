package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions._1_Throwing_an_Exception;

import java.io.IOException;

/**
 * Throwable, - это родительский класс всех исключений, включая класс Error.
 * Для экзамена помните, что выбрасываемый объект является либо исключением, либо ошибкой.
 * Вы не должны перехватывать Throwable непосредственно в своем коде.
 */

public class Main1 {
    public static void main(String[] args) throws IOException {

//        fall1(11); // IOException - Checked

//        fall2(11); // IOException - Checked

//        fall3(null); // IOException - Unchecked

        System.out.println("Hi"); // при IOException, после метода fall2 это выполнится, а после fall1 и fall3 нет
    }

    // методы fall1() и fall2() объявляет, что он может вызвать исключение IOException,
    // которое является проверяемым исключением:

    public static void fall1(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    public static void fall2(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fall3(String input) {
        System.out.println(input.toLowerCase());
    }
}
