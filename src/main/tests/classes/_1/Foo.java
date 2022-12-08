package main.tests.classes._1;

public class Foo {
    private String methodC() {
        return "Foo";
    }

    public String methodA() {
        return methodC();
    }

    public String methodB() {
        return methodC();
    }
}

class Bar extends Foo {
    private String methodC() {
        return "Bar";
    }

    public String methodB() {
        return methodC();
    }

    public static void main(String[] args) {
        Foo foo = new Bar();

        System.out.println(foo.methodA());  // Foo, если метод methodA, переопределить, то будет - Bar
        System.out.println(foo.methodB());  // Bar
    }
}