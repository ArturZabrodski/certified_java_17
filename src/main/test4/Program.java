package main.test4;

public class Program {
    public static void main(String[] args) {
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64

        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12

        String name = "Artur";

        System.out.println(name.charAt(3)); // выводит символ по индексу - u
//        System.out.println(name.charAt(5)); // exception
        System.out.println(name.length());  // длина - 5
        System.out.println(name.indexOf("t")); // находит первый символ и выводит индекс - 2
        System.out.println(name.indexOf('t')); // находит первый символ и выводит индекс - 2
        System.out.println(name.indexOf("ur")); // индекс, 3
        System.out.println(name.indexOf("r", 3)); // находит искать с 3 индекса - 4

        System.out.println("Artur".substring(2)); // начинает искать символы со 2 - tur
        System.out.println("Artur".substring(1,3));         // начинает искать символы со 1 и заканчивает 4 не включительно - rt
        System.out.println("Artur".substring(1,5));         // в данном случае идем до последнего 4 элемента в строке, exception не будет - rtur
//        System.out.println("Artur".substring(3,2));         // exception

        System.out.println(name.substring(name.indexOf('u'))); // ur

        var name2 = "animals";
        System.out.println(name2.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        /**
         * Методы StartsWith() и EndsWith() проверяют, соответствует ли предоставленное значение части
         * строки. Метод contains() не столь специфичен; он ищет совпадения в любом
         * месте строки.
         */

        System.out.println(name.startsWith("rt"));
        System.out.println(name.endsWith("rt"));
        System.out.println(name.contains("rt"));


    }
}
