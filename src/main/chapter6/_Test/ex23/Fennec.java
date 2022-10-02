package main.chapter6._Test.ex23;

/**
 * What is the output of the following program?
 * <p>
 * A. qpz
 * +++B. qpzj
 * C. jzpa
 * D. apj
 * E. apjm
 * F. The code does not compile.
 * G. None of the above
 *
 * Программа компилируется, делая параметр F неправильным. Конструкторы вызываются из
 * дочернего класса вверх, но поскольку каждая строка конструктора является вызовом другого
 * конструктора через this() или super(), они в конечном итоге выполняются сверху вниз.
 * В строке 29 метод main() вызывает конструктор Fennec(), объявленный в строке 19. Помните,
 * что целочисленные литералы в Java по умолчанию считаются int. Этот конструктор вызывает
 * конструктор Fox(), определенный в строке 12, который, в свою очередь, вызывает перегруженный
 * конструктор Fox(), объявленный в строке 11. Поскольку конструктор в строке 11 явно не вызывает
 * родительский конструктор, компилятор вставляет вызов конструктора super() без аргументов,
 * который существует в строке 3 класса Canine. Затем выполняется строка 3, добавляющая q к
 * выходным данным, и цепочка компилятора разматывается. Затем выполняется строка 11, добавляющая
 * p, за которой следует строка 14, добавляющая z. Наконец, выполняется строка 21, и добавляется j,
 * что приводит к окончательному значению для регистратора qpzj и делает вариант B правильным.
 * Для экзамена не забудьте следовать конструкторам от самого низкого уровня вверх, чтобы определить
 * правильный путь, но затем выполняйте их сверху вниз, используя установленный порядок.
 */

class Canine {
    public Canine(boolean t) {
        logger.append("a");
    }

    public Canine() {                                   // 4.1)
        logger.append("q");
    }             // 7

    private StringBuilder logger = new StringBuilder(); // 6

    protected void print(String v) {                    // 6) 8) 10)
        logger.append(v);
    } // 9, 11, 13

    protected String view() {                           // 11)
        return logger.toString();
    } // 14
}

class Fox extends Canine {
    public Fox(long x) {             // 5
        // 3.1. т.к. такого метода нет, то подставляем
        // перед этим super() и летим выше
        print("p");                  // 8 передаем аргумент в метод
    }

    public Fox(String name) {        // 3
        this(2);                  // 4
        print("z");                  // 10
    }
}

public class Fennec extends Fox {
    public Fennec(int e) {            //  1
        super("tails");         //  2
        print("j");                   // 12
    }

    public Fennec(short f) {
        super("eevee");
        print("m");
    }

    public static void main(String... unused) {
        System.out.println(new Fennec(1).view());
    }
}