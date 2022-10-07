package main.chapter8_Lambdas_and_Functional_Interfaces._1_Writing_Simple_Lambdas;

public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}