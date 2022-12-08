package main.tests.classes._7;

class Foo {
    int number = 1;
    void method() {
        System.out.println("Foo");
    }
}

public class Bar extends Foo {
    int number = 2;
    void method() {
        System.out.println("Bar");
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.method();                       // Foo
        System.out.println(foo.number);     // 1


//        Bar bar = (Bar) foo;  // ClassCastException

        Foo bar = new Bar();
        bar.method();                       // Bar
        System.out.println(bar.number);     // 1

        Bar bar1 = new Bar();
        bar1.method();                      // Bar
        System.out.println(bar1.number);    //
    }
}
