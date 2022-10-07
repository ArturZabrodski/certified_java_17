package main.chapter6_Class_Design._other;

class Foo{
    protected String myField = "Foo";

    protected static Object myMethod(){
        return "Foo";
    }
}

public class Bar extends Foo{
    public String myField = "Bar";
    public static String myMethod(){
        return "Bar";
    }

    public static void main(String[] args) {
        Foo foo = new Bar();

        System.out.println(foo.myField);    // Foo
        System.out.println(foo.myMethod()); // Foo
        System.out.println(Foo.myMethod()); // Foo

        Bar bar = new Bar();

        System.out.println(bar.myField);    // Bar
        System.out.println(bar.myMethod()); // Bar
        System.out.println(Bar.myMethod()); // Bar
    }
}
