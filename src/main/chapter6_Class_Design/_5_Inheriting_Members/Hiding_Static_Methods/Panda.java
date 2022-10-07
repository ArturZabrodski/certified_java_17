package main.chapter6_Class_Design._5_Inheriting_Members.Hiding_Static_Methods;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda is chewing");
    }

    public static void main(String[] args) {
        eat();

        Panda p1 = new Panda();
        p1.eat();

        Bear.eat();

        Bear p2 = new Panda();
        p2.eat();
    }
}
