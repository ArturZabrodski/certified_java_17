package main.chapter6_Class_Design._other;

class Foo2{
    protected String myField = "Foo2";

    protected Object myMethod(){
        return "Foo2";
    }
}

public class Bar2 extends Foo2{
    public String myField = "Bar2";
    public String myMethod(){
        return "Bar2";
    }

    public static void main(String[] args) {
        Foo2 foo2 = new Bar2();

        System.out.println(foo2.myField);      // Foo2
        System.out.println(foo2.myMethod());   // Bar2, т.к. метод переопределен
//        System.out.println(Foo2.myMethod()); // не увидит т.к. метод не static

        Bar2 bar2 = new Bar2();

        System.out.println(bar2.myField);      // Bar2
        System.out.println(bar2.myMethod());   // Bar2
//        System.out.println(Bar2.myMethod()); // не увидит т.к. метод не static
    }
}
