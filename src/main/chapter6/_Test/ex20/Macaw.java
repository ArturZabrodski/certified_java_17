package main.chapter6._Test.ex20;

/**
 * Which statement about the following program is correct?
 *
 * A. One line contains a compiler error.
 * B. Two lines contain compiler errors.
 * C. Three lines contain compiler errors.
 * D. The code compiles but throws a ClassCastException at runtime.
 * +++ E. The program compiles and prints 3.
 * F. The program compiles and prints 0.
 */

class Bird {
    int feathers = 0;

    Bird(int x) {
        this.feathers = x;
    }

    Bird fly() {
        return new Bird(1);
    }
}

class Parrot extends Bird {
    protected Parrot(int y) {
        super(y);
    }

    protected Parrot fly() {
        return new Parrot(2);
    }
}

public class Macaw extends Parrot {
    public Macaw(int z) {
        super(z);
    }

    public Macaw fly() {
        return new Macaw(3); // доходим до родительского класса и присваиваем переменной
                                // feathers = 3
    }

    public static void main(String... sing) {
        Bird p = new Macaw(4);
        System.out.print(((Parrot) p.fly()).feathers);
    }
}