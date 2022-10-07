package main.chapter6_Class_Design._Test.ex26;

/**
 * What is the output of the following code?
 * Каков результат следующего кода?
 * <p>
 * A. Orca diving
 * B. Orca diving deeper 3
 * C. The code will not compile because of line 4.
 * +++D. The code will not compile because of line 8.
 * E. The code will not compile because of line 11.
 * F. The code will not compile because of line 12.
 * G. The code will not compile because of line 17.
 * H. None of the above
 *
 * Классы структурированы правильно, но тело метода main() содержит
 * ошибку компилятора. Объект Orca неявно преобразуется в ссылку на Кита в строке 7. Это
 * допускается, потому что Косатка является подклассом китов. При выполнении приведения вся ссылка в
 * строке 8 не имеет доступа к погружению(int... глубина) метод. По этой причине строка 8
 * не компилируется, что делает вариант D правильным.
 */

public abstract class Whale {
    public abstract void dive();

    public static void main(String[] args) {
        Whale whale = new Orca();
//        whale.dive(3); // видит только методы абстрактного класса и переопределенные от него

        Orca whale1 = new Orca();
        whale1.dive(3);  // Orca diving deeper 3
    }
}

class Orca extends Whale {
    static public int MAX = 3;

    public void dive() {
        System.out.println("Orca diving");
    }

    public void dive(int x) { // не отработает, т.к. в абстрактр=ном классе не определен
        System.out.println("Orca diving deeper " + MAX);
    }
}