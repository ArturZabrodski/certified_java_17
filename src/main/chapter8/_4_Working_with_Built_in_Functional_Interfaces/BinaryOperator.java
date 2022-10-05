package main.chapter8._4_Working_with_Built_in_Functional_Interfaces;

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
// omitted static methods
}

//    This means the method signatures look like this:
//    T apply(T t1, T t2); // BinaryOperator

class Main9 {
    public static void main(String[] args) {
        BinaryOperator<String> b1 = String::concat;
        //добавим верхний регистр для toAdd
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd.toUpperCase());
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
}
