package main.chapter6_Class_Design._Test.ex18;

/**
 * Which statements about the following classes are correct? (Choose all that apply.)
 * Какие утверждения о следующих классах верны? (Выберите все, что применимо.)
 * <p>
 * A. The eat() method in Mammal is correctly overridden on line 7.
 * B. The eat() method in Mammal is correctly overloaded on line 7.
 * C. The drink() method in Mammal is correctly overridden on line 10.
 * +++ D. The drink() method in Mammal is correctly hidden on line 10.
 * E. The dance() method in Mammal is correctly overridden on line 11.
 * +++ F. The dance() method in Mammal is correctly overloaded on line 11.
 * G. The eat() method in Primate is correctly hidden on line 12.
 * H. The eat() method in Primate is correctly overloaded on line 12.
 * <p>
 * D, F. Метод eat() является закрытым в классе Mammal. Поскольку он не наследуется в классе Primate,
 * он не переопределяется и не перегружается, что делает параметры A и B неправильными.
 * Метод drink() в Mammal корректно скрыт в классе Monkey, поскольку сигнатура
 * одинакова, и оба они статичны, что делает вариант D правильным, а вариант C неправильным.
 * Версия в классе Monkey выдает новое исключение, но оно не отмечено; следовательно, оно разрешено.
 * Метод dance() в Mammal корректно перегружен в классе Monkey, поскольку сигнал-процедуры не совпадают,
 * что делает вариант E неправильным, а вариант F правильным. Для переопределения методов
 * подписи должны точно совпадать. Наконец, строка 12 является недопустимым переопределением
 * и не компилируется, поскольку она не ковариантна с void, что делает оба параметра G и H неправильными.
 */

public class Mammal {
    private void eat() {
    }

    protected static void drink() {
    }

    public Integer dance(String p) {
        return null;
    }
}

class Primate extends Mammal {
    public void eat(String p) {
    }
}

class Monkey extends Primate {
    public static void drink() throws RuntimeException {
    }

    public Number dance(CharSequence p) {
        return null;
    }

    //    public int eat(String p) { // переопределенный метод должен быть void
    public void eat(String p) {
    }
}