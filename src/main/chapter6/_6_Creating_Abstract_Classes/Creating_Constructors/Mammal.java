package main.chapter6._6_Creating_Abstract_Classes.Creating_Constructors;

abstract class Mammal {
    abstract CharSequence chew();

    public Mammal() {
        System.out.println(chew()); // Does this line compile?
    }
}