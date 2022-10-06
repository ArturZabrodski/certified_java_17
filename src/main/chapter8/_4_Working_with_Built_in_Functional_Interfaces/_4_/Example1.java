package main.chapter8._4_Working_with_Built_in_Functional_Interfaces._4_;

import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        Predicate<String> brownEggs1 = egg.and(brown);
        Predicate<String> otherEggs1 = egg.and(brown.negate());
    }
}
