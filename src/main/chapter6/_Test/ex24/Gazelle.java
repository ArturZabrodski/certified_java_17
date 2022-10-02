package main.chapter6._Test.ex24;

/**
 * What is printed by the following program?
 * <p>
 * A. 182640
 * B. 182943
 * +++ C. 182493
 * D. 421389
 * E. The code does not compile.
 * F. The output cannot be determined until runtime
 * <p>
 * Код компилируется и запускается без проблем, что делает параметры E и F неверными.
 * Сначала инициализируется класс, начиная с суперкласса Antelope, а затем подкласса Газель.
 * Сначала отрабатывают статические переменные и статические инитеры.
 * Потом начиная с родительского класса, отрабатывают остальные инитеры и конструктор,
 * затем дочерние инитеры и дочерний конструктор.
 */

class Antelope {
    public Antelope(int p) {             // 4, но прежде
        System.out.print("4");           // 6
    }

    {
        System.out.print("2");           // 5
    }

    static {
        System.out.print("1");           // 1
    }
}

public class Gazelle extends Antelope {
    public Gazelle(int p) {
        super(6);                     // 3
        System.out.print("3");           // 8
    }

    public static void main(String hopping[]) {
        new Gazelle(0);
    }

    static {                             // 2
        System.out.print("8");
    }

    {
        System.out.print("9");           // 7
    }
}