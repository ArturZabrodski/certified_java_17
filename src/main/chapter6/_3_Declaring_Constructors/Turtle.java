package main.chapter6._3_Declaring_Constructors;

// constructor overloading, default constructor

public class Turtle {
    private String name;

    public Turtle() {      // default constructor
    }

    public Turtle(int age) {
    }

    public Turtle(long age) {
    }

    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }
}