package main.chapter6._Test.ex13;

/**
 * Which of these classes compile and will include a default constructor
 * created by the compiler? (Choose all that apply.)
 * Какой из этих классов компилируется и будет включать конструктор по умолчанию,
 * созданный компилятором? (Выберите все, что применимо.)
 *
 * A, G. Компилятор вставит конструктор без аргументов по умолчанию, если компилятор класса и
 * не определяет никаких конструкторов. Варианты A и G удовлетворяют этому требованию, что делает их
 * правильными ответами. Объявление bird() в option - это объявление метода, а не
 * конструктора. Варианты B и C не компилируются. Поскольку имя конструктора не совпадает
 * с именем класса, компилятор обрабатывает методы seas с отсутствующими типами возврата. Опции D,
 * E и Полная компиляция, но поскольку они объявили по крайней мере один конструктор, компьютер не
 * предоставляет его.
 */

////A.+
//public class Bird {
//}

////B.
//public class Bird {
//    public bird() {
//    }
//}

////C.
//public class Bird {
//    public bird(String name) {
//    }
//}

////D.
//public class Bird {
//    public Bird() {
//    }
//}

////E.
//public class Bird {
//    Bird(String name) {
//    }
//}

////F.
//public class Bird {
//    private Bird(int age) {
//    }
//}

////G.+
//public class Bird {
//    public Bird bird() {
//        return null;
//    }
//}
