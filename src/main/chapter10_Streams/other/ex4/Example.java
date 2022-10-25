package main.chapter10_Streams.other.ex4;

import java.util.Optional;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(s.count()); // 10 количество элементов

        Stream<String> st = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = st.min((st1, st2) -> st1.length() - st2.length());
        min.ifPresent(System.out::println); // ape

        Optional<?> minEmpty = Stream.empty().min((st1, st2) -> 0);
        System.out.println(minEmpty.isPresent()); // false



        Stream<String> str = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        str.findAny().ifPresent(System.out::println);       // monkey (usually)
        infinite.findAny().ifPresent(System.out::println);  // chimp



        
    }
}
