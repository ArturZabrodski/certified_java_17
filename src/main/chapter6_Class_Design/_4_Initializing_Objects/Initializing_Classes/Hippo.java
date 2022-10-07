package main.chapter6_Class_Design._4_Initializing_Objects.Initializing_Classes;

/**
 * Он печатает ABC ровно один раз. Поскольку метод main() находится внутри класса Hippo, класс
 * будет инициализирован первым, начиная с суперкласса и печатая AB. После этого основной()
 * метод выполняется, выводя C. Несмотря на то, что метод main() создает три экземпляра,
 * класс загружается только один раз.
 */

public class Hippo extends Animal {
    static {
        System.out.print("B");
    }
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
}