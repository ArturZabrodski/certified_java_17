package main.chapter8._2_Coding_Functional_Interfaces._1_;

/**
 * interface - это публичный абстрактный класс
 * <p>
 * Функциональный интерфейс - это интерфейс, который содержит один
 * абстрактный метод и может быть помечен аннотацией @FunctionalInterface
 */

public class LambdaIntro {
    public static void main(String[] args) {
        ISum sum1 = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        // записываем с помощью лямбда-выражения
        // переопределяем метод sum
        ISum sum2 = (a, b) -> a + b;

        System.out.println(sum2.sum(2, 3));
    }

    @FunctionalInterface
    public abstract interface ISum {
        public abstract int sum(int a, int b);
    }
}
