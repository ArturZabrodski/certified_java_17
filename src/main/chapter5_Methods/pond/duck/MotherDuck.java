package main.chapter5_Methods.pond.duck;

public class MotherDuck {
    String noise = "quack";

    void quack() {
        System.out.print(noise); // package access is ok
    }
}
