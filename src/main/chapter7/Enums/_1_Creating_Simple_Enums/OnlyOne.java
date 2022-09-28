package main.chapter7.Enums._1_Creating_Simple_Enums;

public enum OnlyOne {
    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}