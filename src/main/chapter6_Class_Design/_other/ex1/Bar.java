package main.chapter6_Class_Design._other.ex1;

class Foo {
    protected String myField = "Foo";

    protected static Object myMethod() {
        return "Foo";
    }
}

public class Bar extends Foo {
    public String myField = "Bar";

    public static String myMethod() {
        return "Bar";
    }

    public static void main(String[] args) {
        Foo foo = new Bar();

        System.out.println(foo.myField);    // Foo
        System.out.println(foo.myMethod()); // Foo, метод static на уровне класса запускается, объект необязателен
        System.out.println(Foo.myMethod()); // Foo, запускается именно етод класса

        Bar bar = new Bar();

        System.out.println(bar.myField);    // Bar
        System.out.println(bar.myMethod()); // Bar, метод static на уровне класса запускается, объект необязателен
        System.out.println(Bar.myMethod()); // Bar, запускается именно метод класса

        // если в Bar не будет метода myMethod, то при вызове запуститься метод
        // из родительского класса, и будет выведено Foo
    }
}
