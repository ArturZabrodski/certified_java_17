package main.tests.exceptions;

/**
 * ХЗ
 */

class MyException extends RuntimeException {
}

public class Program3 {
    static void methodA() throws MyException {
        throw new MyException();
    }

    static void methodB() throws MyException {
        methodA();
    }


    public static void main(String[] args) {
        try {
            methodB();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
