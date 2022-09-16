package main.chapter5;

public class ProgramMethods {
    public static void main(String[] args) {
/**
 * Access Modifiers
 *
 * Модификатор private означает, что метод может быть вызван только из того же класса.
 *
 * Модификатор protected означает, что метод может быть вызван только из класса в том же
 * пакете или подклассе.
 *
 * Модификатор public означает, что метод может быть вызван из любого места.
 *
 * Модификатор доступа по умолчанию – означает, что мы явно не объявляем модификатор доступа в Java для класса, поля, метода и т.д.
 * Переменная или метод, объявленные без модификатора контроля доступа доступны для любого другого класса в том же пакете.
 * Поля в интерфейсе неявно являются public, static, final, а методы в интерфейсе по умолчанию являются public.
 */


/**
 * Optional Specifiers
 *
 * static Указывает, что метод является членом объекта общего класса
 *
 * abstract Используется в абстрактном классе или интерфейсе, когда
 * тело метода исключено
 *
 * final Указывает, что метод не может быть переопределен в подклассе
 *
 * default Используется в интерфейсе для обеспечения реализации
 *
 * synchronized Используется с многопоточным кодом
 *
 * native Используется при взаимодействии с кодом, написанным на другом языке, например C++
 *
 * strictfp Используется для того, чтобы сделать вычисления с плавающей запятой переносимыми вне области видимости
 */


/**
 *                                             private package protected public
 * the same class                               Yes      Yes      Yes     Yes
 * another class in the same package            No       Yes      Yes     Yes
 * a subclass in a different package            No       No       Yes     Yes
 * an unrelated class in a different package    No       No       No      Yes
 */

    }

    public void skip1() {}

//    default void skip2() {} // DOES NOT COMPILE
//    void public skip3() {} // DOES NOT COMPILE

    void skip4() {}

    public void bike1() {}

    public final void bike2() {}

    public static final void bike3() {}

    public final static void bike4() {}

//    public modifier void bike5() {} // DOES NOT COMPILE
//    public void final bike6() {} // DOES NOT COMPILE

    final public void bike7() {}


    // Return Type
    public void swim(int distance) {
        if (distance <= 0) {
// Exit early, nothing to do!
            return;
        }
        System.out.print("Fish is swimming " + distance + " meters");
    }

    public void hike1() {
    }

    public void hike2() {
        return;
    }

    public String hike3() {
        return "";
    }

//    public String hike4() {
//    }                            // DOES NOT COMPILE
//
//    public hike5() {
//    }                             // DOES NOT COMPILE
//
//    public String int hike6() {
//    }                             // DOES NOT COMPILE
//
//    String hike7(int a) {         // DOES NOT COMPILE
//        if (1 < 2) return "orange";
//    }

    String hike8(int a) {
        if (1 < 2) return "orange";
        return "apple";             // COMPILER WARNING
    }

    int getHeight1() {
        int temp = 9;
        return temp;
    }

//    int getHeight2() {
//        int temp = 9L; // DOES NOT COMPILE
//        return temp;
//    }
//
//    int getHeight3() {
//        long temp = 9L;
//        return temp; // DOES NOT COMPILE
//    }


// Method Name
    public void jog1() {}
//    public void 2jog() {} // DOES NOT COMPILE
//    public jog3 void() {} // DOES NOT COMPILE
    public void Jog_$() {}
//    public _() {} // DOES NOT COMPILE
//    public void() {} // DOES NOT COMPILE


// Parameter List
    public void run1() {}
//    public void run2 {} // DOES NOT COMPILE
    public void run3(int a) {}
//    public void run4(int a; int b) {} // DOES NOT COMPILE
    public void run5(int a, int b) {}

// Method Signature
    public void visitZoo1(String name, int waitTime) {}
//    public void visitZoo1(String attraction, int rainFall) {} // DOES NOT COMPILE

    public void visitZoo(String name, int waitTime) {}
    public void visitZoo(int rainFall, String attraction) {}
}
