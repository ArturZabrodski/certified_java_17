package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Выбрасывание исключений
 * при вводе чисел, кроме нуля
 * обработка с помощью try-catch
 * программа выбрасывает исключение и продолжает работать, т.к. цикл бесконечный
 */

public class Exception4 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Пользователь ввел что-то кроме нуля");
                }
            }
        }
    }
}
