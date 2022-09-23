package main.chapter6._3_Declaring_Constructors.Calling_Parent_Constructors_with_super;

public class Zebra extends Animal {
    int age;

    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }

    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }
}