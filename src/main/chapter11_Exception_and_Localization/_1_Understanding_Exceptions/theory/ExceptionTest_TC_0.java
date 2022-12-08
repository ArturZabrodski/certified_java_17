package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.theory;

/**
 * try-catch
 */

public class ExceptionTest_TC_0 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(1);
        }
        System.out.println(2);
// 0
// 1
// 2
    }
}

class ExceptionTest_TC_1 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println(1);
        }
        System.out.println(2);
// 0
// 1
// 2
    }
}

// попадаем либо в один catch, либо никуда, если нет подходящего
// в два catch попасть не можем
// проверка идет сверху-вниз
// потомки записываются сверху
class ExceptionTest_TC_2 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (NullPointerException e) {
            System.out.println(1);
        } catch (RuntimeException e) {
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        }
        System.out.println(4);
// 0
// 2
// 4
    }
}

class ExceptionTest_TC_3 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (NullPointerException e) {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        } catch (Error e) {
            System.out.println(3);
        }
        System.out.println(4);
// 0
// 2
// 4
    }
}

class ExceptionTest_TC_4 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (NullPointerException e) {
            System.out.println(1);
        }               // за скобку не выходим, прерываем выполнение метода, исключение не обработано
        System.out.println(2);
// 0
// RuntimeException...
    }
}

class ExceptionTest_TC_5 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (NullPointerException e) {
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        }               // за скобку не выходим, прерываем выполнение метода, исключение не обработано
        System.out.println(3);
// 0
// RuntimeException...
    }
}

class ExceptionTest_TC_6 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (ArithmeticException e) {
            System.out.println(1);
        } catch (RuntimeException e) {
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        }
        System.out.println(4);
// 0
// 2
// 4
    }
}

class ExceptionTest_TC_7 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (ArithmeticException e) {
            System.out.println(1);
        } catch (Exception e) {       // предок Exception находится перед потомком RuntimeException
            System.out.println(2);
        }
//        catch (RuntimeException e) {
//            System.out.println(3);
//        }
        System.out.println(4);
// java: exception java.lang.RuntimeException has already been caught
    }
}

class ExceptionTest_TC_8 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);
            throw new ArithmeticException();  // нужно обрабатывать новым try-catch
        } catch (ArithmeticException e) {     // сюда не попадаем, т.к. может выполниться только один catch
            // и catch-и между собой не связаны
            System.out.println(2);
        }
        System.out.println(5);
// 0
// 1
// ArithmeticException...
    }
}

class ExceptionTest_TC_9 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);
            throw e;                         // нужно обрабатывать новым try-catch
        } catch (ArithmeticException e) {    // сюда не попадаем, т.к. может выполниться только один catch
            // и catch-и между собой не связаны
            System.out.println(2);
        }
        System.out.println(5);
// 0
// 1
// NullPointerException...
    }
}

// исправляем два предыдущих варианта
class ExceptionTest_TC_9_1 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(1);
            try {
                throw e;
            } catch (NullPointerException ex) {
                System.out.println(3);
            } finally {
                System.out.println(4);
            }
        } catch (ArithmeticException e) {
            System.out.println(2);
        }
        System.out.println(5);
// 0
// 1
// 3
// 4
// 5
    }
}
