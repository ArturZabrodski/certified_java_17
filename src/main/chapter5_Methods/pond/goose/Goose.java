package main.chapter5_Methods.pond.goose;

import main.chapter5_Methods.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.print(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater(); // DOES NOT COMPILE
//        System.out.print(other.text); // DOES NOT COMPILE
    }
}