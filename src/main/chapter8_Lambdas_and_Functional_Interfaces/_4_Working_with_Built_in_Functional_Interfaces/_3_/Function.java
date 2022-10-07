package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._3_;

/**
 * Implementing Function
 * @param <T>
 * @param <R>
 */

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
// omitted default and static methods
}

class Main6 {
    public static void main(String[] args) {
//      Эта функция преобразует строку в длину строки
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5
    }
}