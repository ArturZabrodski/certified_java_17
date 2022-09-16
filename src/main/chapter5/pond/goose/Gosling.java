package main.chapter5.pond.goose;

import main.chapter5.pond.shore.Bird;

public class Gosling extends Bird { // Gosling is a subclass of Bird
    public void swim() {
        floatInWater(); // protected access is ok
        System.out.print(text); // protected access is ok
    }

    public static void main(String[] args) {
        new Gosling().swim();
        new Gosling().floatInWater();
    }
}
