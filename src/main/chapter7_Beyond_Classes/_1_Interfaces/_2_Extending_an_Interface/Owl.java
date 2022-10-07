package main.chapter7_Beyond_Classes._1_Interfaces._2_Extending_an_Interface;

public class Owl implements HasBigEyes {
    public int hunt() {
        return 5;
    }

    public void flap() {
        System.out.println("Flap!");
    }

    public static void main(String[] args) {
        HasBigEyes h = new Owl();
        h.flap();
        h.hunt();

        Owl o = new Owl();
        o.flap();
        o.hunt();

        Nocturnal n = new Owl();
        n.hunt();
//        n.flap();   // DOES NOT COMPILE

        CanFly c = new Owl();
//        c.hunt();  // DOES NOT COMPILE
        c.flap();
    }
}
