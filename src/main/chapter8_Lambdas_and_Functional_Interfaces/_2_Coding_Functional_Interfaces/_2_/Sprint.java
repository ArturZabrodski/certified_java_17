package main.chapter8_Lambdas_and_Functional_Interfaces._2_Coding_Functional_Interfaces._2_;

@FunctionalInterface
public interface Sprint {
    public void sprint(int speed);
}

//@FunctionalInterface
//public interface Dance { // DOES NOT COMPILE, т.к. два метода
//    void move();
//    void rest();
//}