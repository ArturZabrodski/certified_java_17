package main.chapter7._1_Interfaces._4_Inserting_Implicit_Modifiers;

/**
 * эти модификаторы вставляются автоматически.
 * ниже представлены два аналогичных кода.
 */

//public interface Soar {
//    int MAX_HEIGHT = 10;
//    final static boolean UNDERWATER = true;
//    void fly(int speed);
//    abstract void takeoff();
//    public abstract double dive();
//}

public abstract interface Soar {
    public static final int MAX_HEIGHT = 10;
    public final static boolean UNDERWATER = true;
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();

//    private int count = 4; // DOES NOT COMPILE, должен быть public
//    protected void step(); // DOES NOT COMPILE, должен быть public
}