package main.chapter6._4_Initializing_Objects._Initializing_Instances;

/**
 *
 */

public class GiraffeFamily {
    static {
        System.out.print("A");
    }

    {
        System.out.print("B");
    }

    public GiraffeFamily(String name) {
        this(1);
        System.out.print("C");
    }

    public GiraffeFamily() {
        System.out.print("D");
    }

    public GiraffeFamily(int stripes) {
        System.out.print("E");
    }
}
