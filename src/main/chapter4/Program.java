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
        System.out.println("Artur".substring(1, 3));         // начинает искать символы со 1 и заканчивает 4 не включительно - rt
        System.out.println("Artur".substring(1, 5));         // в данном случае идем до последнего 4 элемента в строке, exception не будет - rtur
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
        System.out.println("   T  e   x    t 3     ".stripIndent()); // удаляет пробелы в начале и в конце


        // В первой строке выводится литеральная строка \t, поскольку экранируется обратная косая черта. Во второй
        // строке выводится фактическая вкладка с тех пор, как мы перевели escape. Этот метод можно использовать для escape
        // -последовательностей, таких как \t (табуляция), \n (новая строка), \s (пробел), \" (двойная кавычка) и \' (одинарная кавычка).)
        var str = "1\\t2";
        System.out.println(str);                    // 1\t2
        System.out.println(str.translateEscapes()); // 1	2


        // Первая строка выводит значение false, потому что строка не является пустой; в ней есть пробел.
        // Вторая строка выводит значение true, потому что на этот раз в строке нет символов.
        // Последние две строки выводят значение true, поскольку в них нет никаких символов, кроме пробела.
        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank()); // true


        var name1 = "Kate";
        var orderId = 5;
// All print: Hello Kate, order 5 is ready
        System.out.format("Hello %s, order %d is ready%n", name1, orderId);
        System.out.println("Hello " + name1 + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready", name1, orderId));
        System.out.println("Hello %s, order %d is ready".formatted(name1, orderId));

/**
 * %s Applies to any type, commonly String values
 * %d Applies to integer values like int and long
 * %f Applies to floating-point values like float and double
 * %n Inserts a line break using the system-dependent line separator
 */


        var pi = 3.14159265359;
        System.out.format("[%f]   %n", pi);     // [3,141593]
        System.out.format("[%12.8f]   %n", pi); // [  3,14159265]
        System.out.format("[%012f]   %n", pi);  // [00003.141593]
        System.out.format("[%12.2f]   %n", pi); // [        3,14]
        System.out.format("[%.3f]   %n", pi);   // [3.142]

        String a = "abc";
        String b = a.toUpperCase(); // ABC
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a); // a=abc
        System.out.println("b=" + b); // b=A23


        System.out.println("_____________");

// String - каждый раз при изменении создается новый объект, immutable, ссылка меняется
// StringBuilder - is not immutable, ссылка не меняется
        String alpha1 = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha1 += current;
        System.out.println(alpha1);


        StringBuilder alpha2 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha2.append(current);
        System.out.println(alpha2);


        StringBuilder a1 = new StringBuilder("abc");
        StringBuilder b1 = a1.append("de");  // ссылки будут одиноковые ссылаются на один и тот же объект
        b1 = b1.append("f").append("g");
        System.out.println("a=" + a1); // a=abcdefg
        System.out.println("b=" + b1); // b=abcdefg


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);


        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);  // anim 7 s


    }
}
