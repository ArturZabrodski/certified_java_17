package main.chapter10_Streams.other.ex3;

import java.util.List;
import java.util.stream.Stream;

/**
 * Creating a Parallel Stream
 */

public class Example {
    public static void main(String[] args) {

//        Stream.empty()         // создает поток с нулевыми элементами.
//        Stream.of(varargs)     // Создает поток с перечисленными элементами.
//        name_coll.stream()          // Создает поток из коллекции
//        name_coll.parallelStream()  // Создает поток из коллекции, в котором поток может выполняться параллельно.
//        Stream.generate(supplier)   // Создает поток, вызывая поставщика для каждого элемента по запросу.
//        Stream.iterate(seed, unaryOperator) // Создает поток, используя начальное значение для первого элемента,
                                              // а затем вызывая унарный оператор для каждого
                                              // последующего элемента по запросу.
//        Stream.iterate(seed, predicate, unaryOperator) // Создает поток, используя начальное значение для первого элемента,
                                                         // а затем вызывая унарный оператор для каждого
                                                         // последующего элемента по запросу. Останавливается, если
                                                         // предикат возвращает значение false.



        Stream<String> empty = Stream.empty(); // count = 0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3


        var list = List.of("a", "b", "c");

        Stream<String> fromListParallel = list.parallelStream();

        Stream<Double> randoms = Stream.generate(Math::random);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);



    }
}
