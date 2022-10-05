package main.chapter8._4_Working_with_Built_in_Functional_Interfaces;

/**
 * Implementing BiFunction
 * @param <T>
 * @param <U>
 * @param <R>
 */

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
// omitted default method
}


class Main7 {
    public static void main(String[] args) {
        // Первые два типа в бифункции - это входные типы. Третий - это тип результата.
        // Для ссылки на метод первым параметром является экземпляр, для которого вызывается concat(), а
        // второй передается concat().
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
}