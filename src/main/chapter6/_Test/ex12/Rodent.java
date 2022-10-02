package main.chapter6._Test.ex12;

/**
 * How many lines of the following program contain a compilation error?
 * Сколько строк следующей программы содержат ошибку компиляции?
 *
 * A. None
 * B. 1
 * +++ C. 2
 * D. 3
 * E. 4
 * F. 5
 *
 * Код не компилируется, поэтому вариант A неверен. Первая ошибка компиляции находится в строке 8.
 * Поскольку Rodent объявляет по крайней мере один конструктор, и это не конструктор без аргументов,
 * Beaver должен объявить конструктор с явным вызовом конструктора super().
 * Строка 9 содержит две ошибки компиляции. Во-первых, возвращаемые типы не являются ковариантными,
 * поскольку Number является супертипом, а не подтипом Integer. Во-вторых, унаследованный метод является
 * статическим, а переопределенный метод - нет, что делает это недопустимым переопределением.
 * Код содержит три компиляции-ошибок, хотя они ограничены двумя строками, что делает вариант С -
 * правильным ответом.
 */

public class Rodent {
    public Rodent(Integer x) {}
    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}
class Beaver extends Rodent {
    // добавляем конструктор
    public Beaver(Integer x){
        super(x);
    }

//    public Number chew() throws RuntimeException {
    public static Integer chew() throws RuntimeException {  // метод должен возвращать Integer и быть static
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}