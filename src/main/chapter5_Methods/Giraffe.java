package main.chapter5_Methods;

public class Giraffe {

    public void eat(Giraffe g) {
        drink();
    }

    public void drink() {
    }

    public static void allGiraffeGoHome(Giraffe g) {
        g.drink();
        g.eat(g);
    }

    public static void allGiraffeComeOut() {

    }
}
