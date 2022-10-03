package main.chapter7._2_Enums._1_Creating_Simple_Enums;

public enum OnlyOne {
    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}