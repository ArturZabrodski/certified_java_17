package main.chapter8._3_Using_Method_References;

/**
 * Оператор :: сообщает Java вызвать метод println() позже.
 * Помните, что :: похож на лямбду, и он используется для отложенного
 * выполнения с функциональным интерфейсом.
 */

public class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s);
//        LearnToSpeak learner = System.out::println;

        DuckHelper.teacher(sound, learner);
    }
}