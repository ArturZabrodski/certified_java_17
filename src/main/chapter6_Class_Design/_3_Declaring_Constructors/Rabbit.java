package main.chapter6_Class_Design._3_Declaring_Constructors;

public class Rabbit {
    private Rabbit() {
        System.out.println("user-defined constructor - Rabbit");
    }

    public static void main(String[] args) {
        var r = new Rabbit();  // COMPILE, несмотря на private constructor

        Bunny b1 = new Bunny();
//        Bunny b2 = new Bunny(5); // не видим т.к. private constructor

    }
}
