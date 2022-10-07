package main.chapter6_Class_Design._Test.ex7;

/**
 * What is the output of the following code?
 * Каков результат следующего кода?
 * <p>
 * +++ A. SpiderSpiderArthropod
 * B. SpiderSpiderSpider
 * C. SpiderSpookyArthropod
 * D. SpookySpiderArthropod
 * E. The code will not compile because of line 5.
 * F. The code will not compile because of line 9.
 * G. None of the above
 *
 * Код компилируется и запускается без проблем, поэтому параметры E и F неверны. То
 * Класс Arthropod определяет две перегруженные версии метода printName(). Метод
 * printName(), который принимает значение int в строке 5, правильно переопределен в
 * классе Spider в строке 9. Помните, что переопределенный метод может иметь более широкий
 * модификатор доступа, а защищенный доступ шире, чем доступ к пакету. Из-за полиморфизма
 * переопределенный метод заменяет метод при всех вызовах, даже если используется ссылочная
 * переменная Arthropod, как это делается в методе main(). По этим причинам переопределенный метод
 * вызывается в строках 14 и 15, печатая Spider дважды. Обратите внимание, что короткое значение
 * автоматически преобразуется в более крупный тип int, который затем использует переопределенный метод.
 * Строка 16 вызывает перегруженный метод в классе Arthropod, поскольку длинное значение 5L не соответствует
 * переопределенному методу, в результате чего выводится Arthropod. Следовательно, вариант А является
 * правильным ответом.
 */

class Arthropod {

    protected void printName(long input) {
        System.out.print("Arthropod");
    }

    void printName(int input) {
        System.out.print("Spooky");
    }
}

public class Spider extends Arthropod {
    protected void printName(int input) {
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        Arthropod a = new Spider();
        a.printName((short) 4); // Spider
        a.printName(4);   // Spider
        a.printName(5L);  // Arthropod

        // мой код
        System.out.println();
        Arthropod a1 = new Arthropod();
        a1.printName((short) 4);// Spooky
        a1.printName(4);   // Spooky
        a1.printName(5L);  // Arthropod
    }
}