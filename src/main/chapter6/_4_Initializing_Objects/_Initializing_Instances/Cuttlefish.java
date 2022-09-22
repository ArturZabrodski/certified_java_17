package main.chapter6._4_Initializing_Objects._Initializing_Instances;

/**
 * 0
 * Ready
 * swimmy
 * 1
 * Constructor
 *
 * санала отрабатывают статические операторы, потом main,
 * далее попрядку
 */

public class Cuttlefish {
    private String name = "swimmy";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    {
        COUNT++;
        System.out.println(COUNT);
    }

    public Cuttlefish() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new Cuttlefish();    //
    }
}