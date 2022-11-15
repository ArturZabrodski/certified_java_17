package main.chapter6_Class_Design._other.ex3;

class Foo {

    Object myMethod(String argument) {
        return null;
    }
}

public class Bar extends Foo {
    String myMethod(String argument) {  // override
        return null;
    }

//    String myMethod(Object argument){ // overload
//        return null;
//    }

    Object myMethod(Object argument){  // overload
        return null;
    }

}
