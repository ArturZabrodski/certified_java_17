package main.chapter8._4_Working_with_Built_in_Functional_Interfaces._1_;

import java.util.function.BiFunction;

public class Starter {
    public static void main(String[] args) {
        Starter s = new Starter();
        Person p = new Person();
        //...

        // считаем сумму по больничному
        // применяем лямбда выражение
        s.processHospital(p, 4, (g, d) -> 0.8 * 8 * d * g);

        s.processAddition(p, 8.5, (g, h) -> 2.0 * h * g);


    }

    // используем функциональный интерфейс BiFunction
    public void processHospital(Person p, Integer days, BiFunction<Double, Integer, Double> ph) {
//    public void processHospital(Person p, Integer days, Process<Double, Integer, Double> ph) {
//        Double sum = ph.process(p.getGrade(), days);
        Double sum = ph.apply(p.getGrade(), days);
        // Write to DB
        // Send mail...
    }

    public void processAddition(Person p, Double hours, Process<Double, Double, Double> ph) {
        Double sum = ph.process(p.getGrade(), hours);
    }
}

// Generics
// описание абстрактной функции
// можно использовать интерфейсы с java.util.function
interface Process<P1, P2, R> {
    R process(P1 p1, P2 p2);
}

//interface ProcessHospital {
//    Double process(Double grade, Integer days);
//}

//interface ProcessAddition {
//    Double process(Double grade, Double hours);
//}