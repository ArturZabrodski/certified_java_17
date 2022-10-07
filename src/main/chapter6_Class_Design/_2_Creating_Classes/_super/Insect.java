package main.chapter6_Class_Design._2_Creating_Classes._super;

public class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age);  // в родительском классе эта переменная отсутствует
        System.out.println(numberOfLegs);
    }

    public static void main(String[] n) {
        new Beetle().printData();
    }
}
