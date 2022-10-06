package main.chapter8._4_Working_with_Built_in_Functional_Interfaces._5_;

/**
 * Functional Interfaces for boolean
 */

@FunctionalInterface
public interface BooleanSupplier {
    boolean getAsBoolean();
}

class Main1 {
    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        System.out.println(b1.getAsBoolean()); // true
        System.out.println(b2.getAsBoolean()); // true or false
    }
}
