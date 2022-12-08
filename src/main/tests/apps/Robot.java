package main.tests.apps;

import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке
        sayHello();
        goodDay();
        welcomeUserByName();
        printSuccess();
    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();

        printCity(); // Спросите пользователя, из какого он города, используя метод printCity()
        String city = scanner.next(); // И проинициализируйте строковую переменную city при помощи объекта scanner аналогично тому, как проинициализирована переменная name выше
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    public static void sayHello() {
        System.out.println("Привет!");
    } // Допишите метод sayHello(), который печатает: Привет!

    public static void goodDay() {
        System.out.println("Хорошего дня!");
    } // Допишите метод goodDay(), который выводит строку: Хорошего дня!

    public static void printCity() {
        System.out.println("Из какого вы города?");
    } // Допишите метод printCity(), который спрашивает: Из какого вы города?
}
