package main.tests.strings;

public class Foo {
    @Override
    public String toString() {
        return "Foo";
    }
}

class Bar {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Foo foo = new Foo();
        builder.append(foo);
        builder.append(' ');
        builder.append("Bar");

        System.out.println(builder); // Foo Bar
    }
}
