package main.chapter6_Class_Design._4_Initializing_Objects.Initializing_Instances;

/**
 * Поскольку суперкласс не объявлен, что означает, что суперкласс является объектом,
 * мы можем начать со статических компонентов билетов в зоопарк. В этом случае выполняются строки выводящие 0- и 10-.
 * Далее мы инициализируем экземпляр String. Опять же, поскольку суперкласс не объявлен,
 * мы начинаем с компонентов экземпляра. Выполняются строки, которые выводят BestZoo-.
 * Наконец, мы запускаем конструктор, который выводит z-.
 */

public class ZooTickets {
    private String name = "BestZoo";

    {
        System.out.print(name + "-");
    }

//    private int COUNT = 0;        // должен быть static
    private static int COUNT = 0;

    static {                        // можно static опустить
        System.out.print(COUNT + "-");
    }

    static {
        COUNT += 10;
        System.out.print(COUNT + "-");
    }

    public ZooTickets() {
        System.out.print("z-");
    }

    public static void main(String... patrons) {
        new ZooTickets();    // 0-10-BestZoo-z-
    }
}