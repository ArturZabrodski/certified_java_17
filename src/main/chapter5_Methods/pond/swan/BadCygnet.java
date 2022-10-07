package main.chapter5_Methods.pond.swan;

import main.chapter5_Methods.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
//        duck.quack(); // DOES NOT COMPILE
//        System.out.print(duck.noise); // DOES NOT COMPILE
    }
}
