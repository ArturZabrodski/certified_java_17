package main.chapter8._5_Working_with_Variables_in_Lambdas;

import java.util.function.Consumer;

/**
 * Лямбда-телам разрешено ссылаться на некоторые переменные из
 * окружающего кода. Следующий код является законным:
 */
public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
    }
}


// к переменным name и volume нет доступа в лямбда-выражении
// к переменной color доступ есть.

//public class Crow {
//    private String color;
//
//    public void caw(String name) {
//        String volume = "loudly";
//        name = "Caty";
//        color = "black";
//
//        Consumer<String> consumer = s ->
//                System.out.println(name + " says "           // DOES NOT COMPILE
//                        + volume + " that she is " + color); // DOES NOT COMPILE
//        volume = "softly";
//    }
//}