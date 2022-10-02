package main.chapter6._Test.ex5;

/**
 * Which of the following complete the constructor so that this code prints out 50? (Choose all that apply.)
 * Что из следующего завершает конструктор так, чтобы этот код выводил 50? (Выберите все, что применимо.)
 *
 * A. numSpots = numSpots;
 * B. numSpots = this.numSpots;
 * C. this.numSpots = numSpots;
 * D. numSpots = super.numSpots;
 * +++ E. super.numSpots = numSpots;        Speedster s = new Cheetah(50);
 * F. The code does not compile regardless of the code inserted into the constructor.
 * G. None of the above
 *
 * Вариант E является единственным правильным ответом, поскольку он присваивает
 * переменной экземпляра numSpots в классе Speedster значение из 50.
 * Затем на переменную numSpots в классе Speedster правильно ссылаются в методе
 * main(), выводя 50 во время выполнения.
 */

class Speedster {
    int numSpots;
}

public class Cheetah extends Speedster {
    int numSpots;

    public Cheetah(int numSpots) {
// INSERT CODE HERE
        super.numSpots = numSpots;// этот вариант для Speedster s = new Cheetah(50);
        this.numSpots = numSpots; // этот вариант для Cheetah c = new Cheetah(50);
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.println(s.numSpots);

        // мой код
        Cheetah c = new Cheetah(50);
        System.out.println(c.numSpots);
    }
}