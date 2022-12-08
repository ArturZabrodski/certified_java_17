package main.tests.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List list6 = new ArrayList<>();
        list6.add("A");
//        list6.addAll( 2,List.of("B"));    // будет ошибка т.к. пытаемся добавить 3-й элемент, а нужно по порядку
        list6.addAll( 1,List.of("B"));
        list6.addAll( 1, Collections.singleton("С"));
//        list6.addAll( 1,"B");             // так не работает
        System.out.println(list6);          // [A, С, B]

        list6.clear();
        System.out.println(list6);          // []


        System.out.println("__________________");


        List strings = new ArrayList<>(List.of("A", "B"));

        System.out.println(strings);              // [A, B]

        Iterator iterator = strings.listIterator(1);  // ссылка на первый элемент

        strings.set(1, "C");                      // заменяем 1-ый элемент

        System.out.println(strings);              // [A, C]

        if (iterator.hasNext()){
            System.out.println(iterator.next());  // C
        }

        System.out.println("__________________");

        List list = new ArrayList<>();
        list.addAll(List.of("A")); // [A]
        System.out.println(list);
    }
}
