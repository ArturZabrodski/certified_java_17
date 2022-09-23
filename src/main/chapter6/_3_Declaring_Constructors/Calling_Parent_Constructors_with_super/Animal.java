package main.chapter6._3_Declaring_Constructors.Calling_Parent_Constructors_with_super;

public class Animal {
    private int age;

    public Animal(int age) {
//        super();         // Refers to constructor in java.lang.Object
        this.age = age;
    }
}