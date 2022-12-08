package main.tests.cycle;

/**
 * Правила следующие: вы против компьютера, компьютер «загадывает» число от 0 до 1000, а вам нужно угадать это число.
 * Было бы негуманно делать это без подсказок. На каждый ваш вариант компьютер должен говорить либо «Больше»,
 * если загаданное число больше, или «Меньше», если наоборот.
 * В прекоде уже отражено, что компьютер будет загадывать числа с помощью генератора Random и сохранять их в переменную
 * randomInt. Требуется дописать цикл while — игра должна длиться до тех пор, пока вы не отгадаете загаданное
 * компьютером число. Ваши варианты сохраняются в переменной userInput — её нужно считывать из консоли внутри цикла.
 * Подсказки оформите в коде с помощью условных выражений.
 */

import java.util.Random;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        while (true) {
            userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя
            if (userInput > randomInt) {
                System.out.println("Меньше");
            } else if (userInput < randomInt) {
                System.out.println("Больше");
            } else {
                System.out.println("Вы великолепны! Именно это я загадал.");
                break;
            }
        }
    }
}
