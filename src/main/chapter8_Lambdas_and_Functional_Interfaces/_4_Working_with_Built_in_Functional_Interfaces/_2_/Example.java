package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._2_;

@FunctionalInterface
interface Function<T1, T2, R> {
    R apply(T1 arg1, T2 args2);
}

public class Example {
    public static void main(String[] args) {
        Function<Integer, Integer, Integer> function1 = (x, y) -> (x + y);
        // аналогичный код
//        Function<Integer, Integer, Integer> function1 = Integer::sum;
        System.out.println(function1.apply(3,6));

        Function<Integer, Double, Double> function2 = (x, y) -> (x - y);
        System.out.println(function2.apply(9,6.3));

        Function<Double, Double, Double> function3 = Double::min;
        System.out.println(function3.apply(3.3,5.5));
    }
}


