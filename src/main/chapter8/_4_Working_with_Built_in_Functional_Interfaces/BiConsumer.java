package main.chapter8._4_Working_with_Built_in_Functional_Interfaces;

/**
 * Implementing BiConsumer
 */

import java.util.HashMap;

@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
// omitted default method
}

class Main3 {
    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map); // {chicken=7, chick=1}

        var map1 = new HashMap<String, String>();
        BiConsumer<String, String> b11 = map1::put;
        BiConsumer<String, String> b21 = (k, v) -> map1.put(k, v);
        b11.accept("chicken", "Cluck");
        b21.accept("chick", "Tweep");
        System.out.println(map1); // {chicken=Cluck, chick=Tweep}

    }
}