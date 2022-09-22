package main.chapter6._3_Declaring_Constructors;

public class Rabbit {
    private Rabbit() {
        System.out.println("constructor Rabbit");
    }

    public static void main(String[] args) {
        var r = new Rabbit();  // COMPILE, несмотря на private constructor
    }
}
