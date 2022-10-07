package main.chapter6_Class_Design._Test.ex2;

/**
 * Which modifier pairs can be used together in a method declaration? (Choose all that apply.)
 * Какие пары модификаторов можно использовать вместе в объявлении метода? (Выберите все, что применимо.)
 * <p>
 * +++ A. static and final
 * +++ B. private and static
 * C. static and abstract
 * D. private and abstract
 * E. abstract and final
 * +++ F. private and final
 * <p>
 * final модификатор можно использовать с private и static, делая варианты A и F правильными.
 * Пометка private метода final является избыточной, но допустимой.
 * private метод также может быть помечен как static, что делает вариант B правильным.
 * Параметры C, D и E неверны, поскольку методы, помеченные как static, private или final,
 * не могут быть переопределены; следовательно, они не могут быть помечены как abstract.
 */

public class Ex2 {

    static final void method1() {
    }

    private static void method2() {
    }

//    static abstract void method3(){}
//    private abstract void method4(){}
//    abstract final void method5() {}

    private final void method6() {
    }
}
