package main.chapter8._1_Writing_Simple_Lambdas;

public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}