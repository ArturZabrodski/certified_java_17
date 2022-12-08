package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.theory;

/**
 * try-catch
 * */

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            int n = 0;
            int x = 42;
            int y = x / n;          // на ноль делить нельзя
            System.out.println(y);  // вызоветься, т.к. выброшено исключение
        } catch (ArithmeticException e) {
            System.out.println(1);
        }
        System.out.println(2);
// 0
// 1
// 2
    }
}

class ExceptionTest_1 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            int n = 0;
            double x = 42;
            double y = x / n;       // тип double разрешает деление на ноль, исключение не будет вызвано
            System.out.println(y);  // Infinity - бесконечность, исключение не будет брошено
        } catch (ArithmeticException e) {
            System.out.println(1);
        }
        System.out.println(2);
// 0
// Infinity
// 2
    }
}
