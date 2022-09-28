package main.chapter6._Test.test6;

class Canine {
    public Canine(boolean t) {
        logger.append("a");
    }

    public Canine() {                                   // 4.1)
        logger.append("q");
    }

    private StringBuilder logger = new StringBuilder(); // 4)

    protected void print(String v) {                    // 6) 8) 10)
        logger.append(v);
    }

    protected String view() {                           // 11)
        return logger.toString();
    }
}

class Fox extends Canine {
    public Fox(long x) {             // 3)
                                     // 3.1.) т.к. такого метода нет, то подставляем
                                     // перед этим super() и летим выше
        print("p");                  // 5) передаем аргумент в метод
    }

    public Fox(String name) {        // 2)
        this(2);                  // 2.1.)
        print("z");                  // 7)
    }
}

public class Fennec extends Fox {
    public Fennec(int e) {            // 1)
        super("tails");         // 1.1)
        print("j");                   // 9)
    }

    public Fennec(short f) {
        super("eevee");
        print("m");
    }

    public static void main(String... unused) {
        System.out.println(new Fennec(1).view());
    }
}