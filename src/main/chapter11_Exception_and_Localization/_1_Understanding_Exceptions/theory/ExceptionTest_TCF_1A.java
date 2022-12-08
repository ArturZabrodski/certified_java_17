package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.theory;

/**
 * try-catch-finally
 */

public class ExceptionTest_TCF_1A {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
// 0
// 1
// 5
// 6
    }
}

class ExceptionTest_TCF_1B {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (RuntimeException e) {
            System.out.println(1);
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
// 0
// 1
// 5
// 6
    }
}

class ExceptionTest_TCF_1C {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (NullPointerException e) { // исключение не перехвачено
            System.out.println(1);
        } finally {
            System.out.println(5);
        } // отсюда вылетаем с исключением
        System.out.println(6);
// 0
// 5
// RuntimeException...
    }
}

class ExceptionTest_TCF_10A {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            if (true) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println(1);
            throw new IllegalArgumentException(); // бросам новое исключение
        } finally {
            System.out.println(5);
        } // отсюда вылетаем с исключением IllegalArgumentException
        System.out.println(6); // если убрать if (true), то будет ошибка компиляции из-за этой строки, т.к. недостижимое выражение
// 0
// 1
// 5
// IllegalArgumentException...
    }
}

class ExceptionTest_TCF_10B {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);
        } finally {
            System.out.println(5);
            if (true) {
                throw new IllegalArgumentException();
            }
        } // отсюда вылетаем с исключением IllegalArgumentException
        System.out.println(6); // если убрать if (true), то будет ошибка компиляции из-за этой строки, т.к. недостижимое выражение
// 0
// 1
// 5
// IllegalArgumentException...
    }
}

class ExceptionTest_TCF_20 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);
            throw new IllegalArgumentException(); // бросаем новое исключение
        } catch (IllegalArgumentException e) {    // здесь его обработать не можем
            System.out.println(2);
        } finally {
            System.out.println(5);
        } // отсюда вылетаем с исключением IllegalArgumentException
        System.out.println(6);
// 0
// 1
// 5
// IllegalArgumentException...
    }
}

