package main.chapter10_Streams.other.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAAAAA");
        list.add("111111");
        list.add("CCCCCC");
        list.add("222222");
        list.add("BBBBBB");
        list.add("333333");

        // создаем объект стрим
        Stream stream =  list.stream();

        // Экземпляр, стрима нельзя использовать более одного раза
        // промежуточных операторов вызванных на одном стриме может быть множество,
        // в то время терминальный оператор только один:
        stream
                .limit(5)                       // выводим из списка только первые 5 элементов
                .filter(val -> !val.equals("111111"))   // фильтр, кроме данного элемента
                .filter(val -> !val.equals("AAAAAA"))
                .map(val -> val + " A")                 // даёт возможность создать функию с помощью которой мы будем изменять каждый элемент и пропускать его дальше
                .sorted()                               // сортируем
                .forEach(System.out::println);          // выводим элемент, без foreach вся эта штука не сработает

        System.out.println("___________________");



//        Терминальные операторы:

//        forEach(Consumer action) // аналог for each (Consumer<T> выполняет некоторое действие над объектом типа T,
                                   //  при этом ничего не возвращая);

//        count() // возвращает количество елементов стрима:
//        System.out.println(stream.count());

//        collect(Collector collector) // метод собирает все элементы в список, множество или другую коллекцию,
                                       // сгруппировывает элементы по какому-нибудь критерию, объединяет всё в строку и т.д.:



//        Пример c потоком:
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(x -> System.out.print(x + " "));

        System.out.println();

//        Пример без потока:
        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x + " ");
        }




    }
}
