package main.chapter6._3_Declaring_Constructors._Default_Constructor;

//public class Elephant extends Mammal {
//    public Elephant() {}  // DOES NOT COMPILE, т.к. у родителя нет конструктора по умолчанию
//}


//public class Elephant extends Mammal {
//    public Elephant() {
//        super(); // DOES NOT COMPILE
//    }
//}

public class Elephant extends Mammal {
    public Elephant() {
        super(4); // Explicit call to parent constructor
    }
}