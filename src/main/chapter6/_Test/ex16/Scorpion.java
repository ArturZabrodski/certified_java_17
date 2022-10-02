package main.chapter6._Test.ex16;

/**
 * What is the result of the following?
 *
 * A. qu qu qumrcrc
 * B. u u ucrcrm
 * C. uq uq uqmcrcr
 * +++ D. uq uq uqcrcrm
 * E. qu qu qumcrcr
 * F. qu qu qucrcrm
 * G. The code does not compile.
 *
 * сходя из порядка инициализации, статические компоненты инициализируются первыми,
 * начиная с класса Arachnid, поскольку он является родительским для класса Scorpion,
 * который инициализирует StringBuilder в u. Статический инициализатор в
 * Затем Scorpion обновляет sb, чтобы он содержал uq, который печатается дважды в строках 13 и 14 вместе
 * с пробелами, разделяющими значения. Затем экземпляр Arachnid инициализируется в строке 15.
 * В Arachnid есть два инициализатора экземпляра, и они выполняются по порядку, добавляя cr к
 * StringBuilder, приводящий к значению uqcr. Затем экземпляр Scorpion инициализируется
 * в строке 16. Инициализаторы экземпляра в суперклассе Arachnid запускаются первыми, снова добавляя cr
 * и обновляя значение sb до uqcrcr. Наконец, инициализатор экземпляра в Scorpion запускается
 * и добавляет m. Программа завершается выводом конечного значения uq uq uqcrcrm,
 * что делает вариант D правильным ответом.
 */

class Arachnid {
    static StringBuilder sb = new StringBuilder();

    {
        sb.append("c");
    }

    static {
        sb.append("u");
    }

    {
        sb.append("r");
    }
}

public class Scorpion extends Arachnid {
    static {
        sb.append("q");
    }

    {
        sb.append("m");
    }

    public static void main(String[] args) {
        System.out.print(Scorpion.sb + " ");
        System.out.print(Scorpion.sb + " ");
        new Arachnid();
        new Scorpion();
        System.out.print(Scorpion.sb);
    }
}