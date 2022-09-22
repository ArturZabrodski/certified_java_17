package main.chapter6._5_Inheriting_Members._Overriding_Method;

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