package main.chapter6_Class_Design._Test.ex1;

/**
 * Which code can be inserted to have the code print 2?
 * Какой код можно вставить, чтобы напечатать код 2?
 * <p>
 * A. Replace line 1 with BirdSeed(2);.
 * B. Replace line 2 with BirdSeed(2);.
 * C. Replace line 1 with new BirdSeed(2);.
 * D. Replace line 2 with new BirdSeed(2);.
 * +++ E. Replace line 1 with this(2);.
 * F. Replace line 2 with this(2);.
 * G. The code prints 2 without any changes.
 *
 * A и B не будут компилироваться, потому что конструкторы не могут быть вызваны без new.
 * C и D будут скомпилированы, но создадут новый объект, а не зададут поля в этом.
 * В результате программа будет печатать 0, а не 2, во время выполнения.
 * Вызов перегруженной структуры с использованием this() или родительского конструктора
 * с использованием super() разрешен только в первой строке конструктора,
 * что делает параметр E правильным, а параметр F неправильным.
 * Наконец, параметр G неверен, поскольку программа выводит 0 без каких-либо изменений, а не 2.
 */


public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() {
// LINE 1,
        call = false;
// LINE 2 сюда вставлять не нужно
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        var seed = new BirdSeed();
        System.out.print(seed.numberBags);
    }
}
