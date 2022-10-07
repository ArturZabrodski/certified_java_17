package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._4_;

import java.util.function.Function;

public class Example3 {
    public static void main(String[] args) {
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined = after.compose(before);
        System.out.println(combined.apply(3)); // 8
    }
}
