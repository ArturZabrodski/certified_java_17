package main.chapter8._4_Working_with_Built_in_Functional_Interfaces._3_;

/**
 * Implementing BiPredicate
 *
 * @param <T>
 * @param <U>
 */

@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
// omitted default methods
}

class Main5 {
    public static void main(String[] args) {
        // Предикат часто используется при фильтрации или сопоставлении.
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b1.test("chicken", "chick")); // true
        System.out.println(b2.test("chicken", "chick")); // true
    }
}
