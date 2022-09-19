package main.chapter5.pond.shore;

import main.chapter5.pond.goose.Gosling;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // protected access is ok
        System.out.print(bird.text); // protected access is ok
    }
}