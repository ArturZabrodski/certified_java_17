package main.chapter6._2_Creating_Classes._super;

// super

public class Crocodile extends Reptile {
    protected int speed = 20;

//    public int getSpeed() {
//        return super.speed; // Causes the program to now print 10
//    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] data) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed()); // 20
    }
}
