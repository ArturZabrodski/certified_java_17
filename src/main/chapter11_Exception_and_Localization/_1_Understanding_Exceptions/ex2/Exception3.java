package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex2;

import java.util.Scanner;

/**
 * Выбрасывание исключений
 * при вводе чисел, кроме нуля
 * обработка через trows
 * программа выбрасывает исключение и завершает работу цикла
 */

public class Exception3 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                throw new ScannerException("Пользователь ввел что-то кроме нуля");
            }
        }
    }
}
