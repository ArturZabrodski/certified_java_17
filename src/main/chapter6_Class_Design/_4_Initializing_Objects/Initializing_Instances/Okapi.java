package main.chapter6_Class_Design._4_Initializing_Objects.Initializing_Instances;

/**
 * AFBECHG
 * BECHG
 */

public class Okapi extends GiraffeFamily {
    static {
        System.out.print("F");
    }

    public Okapi(int stripes) {
        super("sugar");
        System.out.print("G");
    }

    {
        System.out.print("H");
    }

    public static void main(String[] grass) {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}