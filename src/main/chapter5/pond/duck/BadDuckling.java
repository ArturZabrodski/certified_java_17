package main.chapter5.pond.duck;

public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
//        duck.quack(); // DOES NOT COMPILE
//        System.out.print(duck.noise); // DOES NOT COMPILE
    }
}