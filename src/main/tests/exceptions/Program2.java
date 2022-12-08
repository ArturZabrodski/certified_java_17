package main.tests.exceptions;

import java.io.IOException;

/**
 * java.lang.RuntimeException
 * at main.tests.exceptions.Program2.methodA(Program2.java:8)
 * at main.tests.exceptions.Program2.main(Program2.java:19)
 */
public class Program2 {
    void methodA() throws ArithmeticException {
        throw new RuntimeException();
    }

    void methodB() throws IOException {
        methodA();
    }

    public static void main(String[] args) {
        Program2 test = new Program2();

        try {
            test.methodA();
        } catch (RuntimeException e) {
//            e.printStackTrace();
            System.out.println(1);
        }
    }
// 1
}

class Program2_1 {
    void methodA() throws ArithmeticException {
        throw new RuntimeException();
    }

    void methodB() throws IOException {
        methodA();
    }

    public static void main(String[] args) {
        Program2_1 test = new Program2_1();

        try {
            test.methodB();
        } catch (RuntimeException e) {
//            e.printStackTrace();
            System.out.println(1);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println(2);
        }
    }
// 1
}