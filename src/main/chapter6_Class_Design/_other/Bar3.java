package main.chapter6_Class_Design._other;

class Foo3{

    Object myMethod(String argument){
        return null;
    }
}

public class Bar3 extends Foo3{
    String myMethod(Object argument){  // override
        return null;
    }
//    String myMethod(Object argument){    // overload
//        return null;
//    }
//    Object myMethod(Object argument){    // overload
//        return null;
//    }

}
