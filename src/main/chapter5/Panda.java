package main.chapter5;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
//    static final double height; // DOES NOT COMPILE, т.к. не присвоено значение

    static {
        bamboo = 5;
    }
}
