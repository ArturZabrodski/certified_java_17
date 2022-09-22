package main.chapter6._3_Declaring_Constructors._Default_Constructor;

//public class Seal extends Mammal{
//    public Seal() {
//        super(); // DOES NOT COMPILE
//    }
//}


//public class Seal extends Mammal{  // DOES NOT COMPILE, т.к. у родителя нет конструктора по умолчанию
//}

public class Seal extends Mammal {
    public Seal() {
        super(6); // Explicit call to parent constructor
    }
}