package main.chapter6._Test.ex8;

/**
 * What is the result of the following code?
 * Каков результат следующего кода?
 *
 * A. Oh-Bird
 * B. Oh-Pelican
 * C. Wow-Oh-Bird
 * +++ D. Wow-Oh-Pelican
 * E. The code contains a compilation error.
 * F. None of the above
 *
 * Код компилируется без проблем. Конструкторы суперкласса вызываются в абстрактных классах
 * таким же образом, как и в неабстрактных классах. При создании объекта вызывается контруктор
 * Pelican(). Компилятор автоматически вставляет super() в качестве первой строки конструктора,
 * определенного в строке 6. Затем программа вызывает конструктор в
 * строке 3 и выводит Wow-. Затем элемент управления возвращается в строку 6, и печатается Oh-.
 * Наконец, вызов метода в строке 10 использует версию fly() в классе Pelican, поскольку она помечена
 * частный и ссылочный тип var разрешен как Pelican. Конечным результатом является
 * Вау-О-Пеликан, делая вариант D правильным ответом. Помните, что частные методы
 * не могут быть переопределены. Если бы ссылочным типом chirp был Bird, то код не
 * компилировался бы, поскольку он был бы недоступен за пределами класса.
 */

abstract class Bird {
    private final void fly() {
        System.out.println("Bird");
    }

    protected Bird() {
        System.out.print("Wow-");
    }
}

public class Pelican extends Bird {
    public Pelican() {
        System.out.print("Oh-");
    }

    protected void fly() {
        System.out.println("Pelican");
    }

    public static void main(String[] args) {

        var chirp = new Pelican();      // Wow-Oh-
        chirp.fly();                    // Pelican

        Pelican chirp1 = new Pelican();  // аналогично предыдущему коду  Wow-Oh-
        chirp1.fly();                    // Pelican

        Bird chirp2 = new Pelican();     // Wow-Oh-
//        chirp2.fly();                  // видит методы Bird, но не увидит fly, т.к. private

//        Bird chirp3 = new Bird(); // абстрактный класс создать нельзя

    }
}