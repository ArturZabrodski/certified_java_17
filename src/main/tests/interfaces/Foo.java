package main.tests.interfaces;

public interface Foo {
    String name = "Foo";

    void print();
}

class Bar implements Foo {
    String name = "Bar";

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Foo foo = new Bar();

        foo.print();  // Bar
    }
}
