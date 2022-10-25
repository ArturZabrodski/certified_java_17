package main.chapter10_Streams.other.ex2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average()); // Optional.empty

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get()); // 95.0

//        Optional<Double> opt1 = average();
//        System.out.println(opt1.get()); // NoSuchElementException

        Optional<Double> opt2 = average(90, 100);
        opt2.ifPresent(System.out::println);


        Optional<Double> opt3 = average();
        System.out.println(opt3.orElse(Double.NaN));             // NaN
        System.out.println(opt3.orElseGet(() -> Math.random())); // 0.45697371547137244
//        System.out.println(opt3.orElseThrow());                // NoSuchElementException


    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }
}
