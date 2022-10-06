package main.chapter8._4_Working_with_Built_in_Functional_Interfaces._3_;

/**
 * Implementing Predicate
 *
 * @param <T>
 */

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
// omitted default and static methods
}

class Main4 {
    public static void main(String[] args) {
        // Предикат часто используется при фильтрации или сопоставлении.
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test("")); // true
        System.out.println(p2.test("")); // true
    }
}


