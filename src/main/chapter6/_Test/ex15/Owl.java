package main.chapter6._Test.ex15;

/**
 * Which statements about the following program are correct? (Choose all that apply.)
 * Какие утверждения о следующей программе верны? (Выберите все, что применимо.)
 * <p>
 * A. It compiles and prints true.
 * B. It compiles and prints false.
 * +++ C. The code will not compile because of line 2.
 * D. The code will not compile because of line 5.
 * E. The code will not compile because of line 7.
 * F. The code will not compile because of line 8.
 * G. None of the above
 *
 * Код не компилируется, потому что метод is Blind() в Nocturnal не
 * помечен как абстрактный и не содержит тела метода. Если бы модификатор abstract был
 * добавлен в строку 2, то код скомпилировался бы и напечатал false во время выполнения.
 */

abstract class Nocturnal {
    //    boolean isBlind(); // метод должен быть abstract
    abstract boolean isBlind();
}

public class Owl extends Nocturnal {
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        var nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}