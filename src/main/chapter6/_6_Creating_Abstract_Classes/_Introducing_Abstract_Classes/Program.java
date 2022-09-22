package main.chapter6._6_Creating_Abstract_Classes._Introducing_Abstract_Classes;

/**
 * Только методы экземпляра могут быть помечены как абстрактные внутри класса, а не переменные, конструкторы
 * или статические методы.
 * <p>
 * Абстрактный метод может быть объявлен только в абстрактном классе.
 * <p>
 * Неабстрактный класс, расширяющий абстрактный класс, должен реализовывать все унаследованные
 * абстрактные методы.
 */

public class Program {
    public static void main(String[] args) {
        Canine w = new Wolf();
        w.bark();

        Wolf w1 = new Wolf();
        w1.bark();

        Canine f = new Fox();
        f.bark();

        Canine c = new Coyote();
        c.bark();
    }
}
