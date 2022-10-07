package main.chapter6_Class_Design._6_Creating_Abstract_Classes.Creating_Constructors;

abstract class Mammal {
    abstract CharSequence chew();

    public Mammal() {
        System.out.println(chew()); // Does this line compile?
    }
}