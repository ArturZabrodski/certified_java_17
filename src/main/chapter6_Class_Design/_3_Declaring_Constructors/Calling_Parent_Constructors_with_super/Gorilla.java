package main.chapter6_Class_Design._3_Declaring_Constructors.Calling_Parent_Constructors_with_super;

public class Gorilla extends Animal2 {

    public Gorilla(int age) {
        super(age, "Gorilla"); // Calls the first Animal constructor
    }

    public Gorilla() {
        super(5);               // Calls the second Animal constructor
    }
}