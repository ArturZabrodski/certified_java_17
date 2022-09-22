package main.chapter6._4_Initializing_Objects._Initializing_Instances;

public class Chimpanzee extends Ape {
    public Chimpanzee() {
        super(2);
        System.out.print("Chimpanzee-");
    }

    public static void main(String[] args) {
        new Chimpanzee();  // Primate-Ape1-Chimpanzee-
    }
}