package main.chapter8._4_Working_with_Built_in_Functional_Interfaces._3_;

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
// omitted static method
}

//    This means the method signatures look like this:
//    T apply(T t); // UnaryOperator

class Main8 {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("chirp")); // CHIRP
        System.out.println(u2.apply("chirp")); // CHIRP
    }
}
