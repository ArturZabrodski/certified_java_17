package main.chapter6._Test.ex19;

/**
 * What is the output of the following code?
 *
 * A. AALizard
 * B. BALizard  - если добавить конструктор по умолчанию
 * C. BLizardA
 * D. ALizard
 * E. The code will not compile because of line 3.
 * +++ F. None of the above
 *
 * Класс Reptile определяет конструктор, но это не конструктор без аргументов.
 * Таким образом, конструктор Lizard должен явно вызывать super(), передавая значение int.
 * По этой причине строка 9 не компилируется, и вариант F является правильным ответом.
 * Если бы класс Lizard был исправлен для вызова соответствующего конструктора super(),
 * то программа напечатала бы Blizzard во время выполнения, при этом сначала запускается
 * статический инициализатор, затем инициализатор экземпляра и, наконец, вызов метода с
 * использованием переопределенного метода.
 */

class Reptile {
    {
        System.out.print("A");
    }
//    public Reptile() { // не хватало конструктора по умолчанию
//    }

    public Reptile(int hatch) {
    }

    void layEggs() {
        System.out.print("Reptile");
    }
}

public class Lizard extends Reptile {
    static {
        System.out.print("B");
    }

    public Lizard(int hatch) {
        // либо добавляем конструктор по умолчанию, чтобы вызывалос super()
        super (4); // либо вызываем, тот контруктор из родительского класса, который есть
    }

    public final void layEggs() {
        System.out.print("Lizard");
    }

    public static void main(String[] args) {
        var reptile = new Lizard(1);
        reptile.layEggs();
    }
}