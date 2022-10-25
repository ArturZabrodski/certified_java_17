package main.chapter6_Class_Design._other.ex4;

class Foo {
    static String name = "Foo";

    void print() {
        System.out.println(this.name);
    }
}

public class Bar extends Foo {
    String name = "Bar";

    //     static void printName(){     // выдает ошибку, т.к. нельзя давать доступ к super() через static
    void printName() {
        super.print();
    }

    public static void main(String[] args) {
//        new Bar.printName();  // c new не работает
        Bar bar = new Bar();
        bar.printName();               // Foo
        System.out.println(bar.name);  // Bar

        Foo foo = new Bar();
        System.out.println(Foo.name);

    }
}
