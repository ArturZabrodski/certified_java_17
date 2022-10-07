package main.chapter7_Beyond_Classes._2_Enums._1_Creating_Simple_Enums;

public enum OnlyOne {
    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}