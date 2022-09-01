package main.chapter4;

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

        System.out.println("\nmethods startsWith() endsWith() contains()");

        System.out.println(name.startsWith("Ar"));
        System.out.println(name.startsWith("rt"));

        System.out.println(name.endsWith("ur"));
        System.out.println(name.endsWith("rt"));

        System.out.println(name.contains("Ar"));
        System.out.println(name.contains("rt"));
        System.out.println(name.endsWith("ur"));

        System.out.println("\nmethod replace()");

        System.out.println("abcabc".replace('a', 'A'));  // AbcAbc
        System.out.println("aBcabc".replace("B", "b")); // abcabc

        System.out.println("\nmethods strip() trim()");

        /**
         * Методы strip() и trim() удаляют пробелы из начала и конца строки.
         * метод stripLeading() удаляет пробелы из начала строки и оставляет их в конце.
         * Метод stripTrailing() удаляет пробелы из конца строки и оставляет их в начале.
         */

        System.out.println("abc".strip());          // abc
        System.out.println("     a b c\n".strip()); // a b c
        String text = " abc  ";                     // 6 символов
        System.out.println(text.trim().length());   // 3
        System.out.println(text.strip().length());  // 3
        System.out.println(text.stripLeading().length()); // 8
        System.out.println(text.stripTrailing().length());// 4

        System.out.println("Text1".indent(5));     // отступ в символах и + разрыв строки
        System.out.println("     Text2".indent(-5));  // отступ в символах и + разрыв строки
                                                         // при отрицательном числе пробелы отступа удаляются
        System.out.println("   T  e   x    t 3     ".stripIndent());


    }
}
