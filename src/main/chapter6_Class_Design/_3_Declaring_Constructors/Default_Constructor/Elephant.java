package main.chapter6_Class_Design._3_Declaring_Constructors.Default_Constructor;

//public class Elephant extends Mammal {
//    public Elephant() {}  // DOES NOT COMPILE, т.к. у родителя нет конструктора по умолчанию
//}


//public class Elephant extends Mammal {
//    public Elephant() {
//        super(); // DOES NOT COMPILE, т.к. у родителя нет конструктора по умолчанию
//    }
//}

public class Elephant extends Mammal {
    public Elephant() {
        super(4); // Explicit call to parent constructor
    }
}