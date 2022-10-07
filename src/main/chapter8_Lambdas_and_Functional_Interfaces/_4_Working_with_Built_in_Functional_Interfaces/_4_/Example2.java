package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._4_;

import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(", 2: " + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie"); // 1: Annie,2: Annie
    }
}
