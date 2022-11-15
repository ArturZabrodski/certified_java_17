package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions._1_Throwing_an_Exception.ex0;

/**
 * допустимые конструкции try catch finally:
 * TC, TF, TCF
 */

public class ExceptionTest_TC_0 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException(); // сами вызываем исключение и попадаем в catch
        } catch (RuntimeException e) {
            System.out.println(1);
        }
        System.out.println(2);

        // 0 1 2

        System.out.println();



        try {
            System.out.println(0); // в catch не попадаем т.к. нет код не вызывает исключение
        } catch (RuntimeException e) {
            System.out.println(1);
        }
        System.out.println(2);

        // 0 2
    }
}
