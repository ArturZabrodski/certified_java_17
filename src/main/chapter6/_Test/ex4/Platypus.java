package main.chapter6._Test.ex4;

/**
 * What is the output of the following program?
 * Каков результат следующей программы?
 * <p>
 * A. Platypus
 * B. Mammal
 * C. PlatypusMammal
 * D. MammalPlatypus
 * E. The code will compile if line 7 is changed.
 * +++ F. The code will compile if line 9 is changed.
 * <p>
 * Код не будет компилироваться как есть, поскольку родительский класс Mammal не определяет
 * конструктор без аргументов. По этой причине первая строка конструктора Platypus должна быть
 * явным вызовом super(int), что делает вариант F правильным ответом. Вариант E неверен,
 * так как строка 7 компилируется без проблем. Метод sneeze() в классе Mammal помечен
 * как private, что означает, что он не наследуется и, следовательно, не переопределяется в классе Platypus.
 * По этой причине метод sneeze() в классе Platypus может свободно определять один и тот же
 * метод с любым типом возвращаемого значения.
 */

class Mammal {
    private void sneeze() {
    }

    // нет конструктора без аргументов
    public Mammal(int age) {
        System.out.print("Mammal");
    }
}

public class Platypus extends Mammal {
    int sneeze() {
        return 1;
    }

    public Platypus() {
//        super();     // этот конструктор вызывается по умолчанию, но в родительском классе он отсутствует
        super(5);  // добавляем сюда этот код, вызываю тот конструктор, который есть в родительском классе
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        // здесь все нормально, код вызывает конструктор
        new Mammal(5); // Mammal

        System.out.println();
        // добавил свой код для проверки
        new Platypus();     // MammalPlatypus
    }
}
