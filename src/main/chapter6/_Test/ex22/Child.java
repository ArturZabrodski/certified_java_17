package main.chapter6._Test.ex22;

/**
 * What does the following program print?
 *
 * A. Elysia Sophia
 * B. Webby Olivia
 * C. Olivia Olivia
 * +++D. Olivia Sophia
 * E. The code does not compile.
 * F. None of the above
 *
 * Код компилируется и запускается без проблем, что делает параметр E неправильным.
 * Дочерний класс переопределяет метод setName() и скрывает статическую переменную name,
 * определенную в унаследованном классе Person. Поскольку переменные только скрыты, а
 * не переопределены, доступны две переменные с различными именами, в зависимости от
 * местоположения и типа ссылки. Строка 8 создает дочерний экземпляр, который неявно приведен
 * к ссылочному типу Person в строке 9. В строке 10 используется дочерний ссылочный тип,
 * обновляющий Дочерний.имя Элизии. В строке 11 используется ссылка Person-тип связи, обновление
 * Person.name к Софии. Строки 12 и 13 вызывают переопределенный метод экземпляра set Name(),
 * объявленный в строке 6. Это устанавливает Ребенка.имя для Вебби в режиме онлайн
 * 12, а затем к Оливии на 13-й строке. Конечные значения дочернего элемента.имя и
 * Person.name являются Оливия и София, соответственно, делают вариант D правильным ответом.
 */

class Person {
    static String name;

    void setName(String q) {
        name = q;
    }
}

public class Child extends Person {
    static String name;

    void setName(String w) {
        name = w;
    }

    public static void main(String[] p) {
        final Child m = new Child();
        final Person t = m;
//        final Person t = new Child(); // аналогично
        m.name = "Elysia";
        t.name = "Sophia";
        m.setName("Webby");
        System.out.println("m = " + m.name + " t = " + t.name);
        t.setName("Olivia"); // т.к. дочерний класс переопределяет родительский
                             // то будет присвоено в setter Child
        System.out.println("m = " + m.name + " t = " + t.name);

        // второй случай
        final Child m2 = new Child();
        final Person t2 = new Person();
        m2.name = "Elysia";
        t2.name = "Sophia";
        m2.setName("Webby");
        System.out.println("m2 = " + m2.name + " t2 = " + t2.name);
        t2.setName("Olivia"); // будет присвоен в setter Person
        System.out.println("m2 = " + m2.name + " t2 = " + t2.name);
    }
}
