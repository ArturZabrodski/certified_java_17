package main.chapter6._Test.ex11;

/**
 * What is the result of the following?
 * Каков результат следующего?
 *
 * A. tacb
 * B. tacf
 * +++ C. tacbf
 * D. tcafb
 * E. taftacb
 * F. The code does not compile.
 * G. An exception is thrown.
 */

public class PolarBear {
    StringBuilder value = new StringBuilder("t");

    {
        value.append("a");
    }

    {
        value.append("c");
    }

    private PolarBear() {
        value.append("b");
    }

    public PolarBear(String s) {
        this();
        value.append(s);
    }

    public PolarBear(CharSequence p) {
        value.append(p);
    }

    public static void main(String[] args) {
        Object bear = new PolarBear();
        bear = new PolarBear("f");
        System.out.println(((PolarBear) bear).value);
    }
}
