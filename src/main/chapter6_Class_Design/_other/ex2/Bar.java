package main.chapter6_Class_Design._other.ex2;

class Foo {
    protected String myField = "Foo";

    protected Object myMethod() {
        return "Foo";
    }
}

public class Bar extends Foo {
    public String myField = "Bar";

    public String myMethod() {
        return "Bar";
    }

    public static void main(String[] args) {
        Foo foo = new Bar();

        System.out.println(foo.myField);      // Foo
        System.out.println(foo.myMethod());   // Bar, т.к. метод переопределен и не static, т.е. относится к объекту
//        System.out.println(Foo.myMethod()); // не увидит т.к. метод не static

        Bar bar = new Bar();

        System.out.println(bar.myField);      // Bar
        System.out.println(bar.myMethod());   // Bar
//        System.out.println(Bar.myMethod()); // не увидит т.к. метод не static
    }
}
