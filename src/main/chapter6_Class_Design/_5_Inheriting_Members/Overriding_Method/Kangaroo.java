package main.chapter6_Class_Design._5_Inheriting_Members.Overriding_Method;

public class Kangaroo extends Marsupial {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

//    public double getAverageWeight() {
//        return getAverageWeight()+20; // StackOverflowError
//    }

    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight()); // 50.0
        System.out.println(new Kangaroo().getAverageWeight()); // 70.0
    }
}