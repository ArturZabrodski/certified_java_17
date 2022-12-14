package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._3_;

/**
 * Implementing Consumer
 */

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
// omitted default method
}

class Main2 {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie"); // Annie
        c2.accept("Annie"); // Annie
    }
}