package main.chapter9_Collections_and_Generics._1_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


public class Example2 {
    public static void main(String[] args) {
        /**
         * Iterating
         */
        System.out.println("Iterating\n");

        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        // аналогичный код
//        cats.forEach(c -> System.out.println(c));

        // устаревшие варианты кода
//        for (String element : coll)
//            System.out.println(element);

//        Iterator<String> iter = coll.iterator();
//        while (iter.hasNext()) {
//            String string = iter.next();
//            System.out.println(string);
//        }

        /**
         * Determining Equality
         */
        System.out.println("\nDetermining Equality\n");

        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);
        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);

        System.out.println(list1.equals(list2)); // false
        System.out.println(set1.equals(set2)); // true
        System.out.println(list1.equals(set1)); // false


        /**
         * NullPointerException
         */
        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }
}
