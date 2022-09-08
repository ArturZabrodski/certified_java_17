package main.chapter4;

public class ProgramString {
    public static void main(String[] args) {
        int thr = 3;
        String four = "4";
        System.out.println(1 + 2 + thr + four); // 64

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
         * Метод stripLeading() удаляет пробелы из начала строки и оставляет их в конце.
         * Метод stripTrailing() удаляет пробелы из конца строки и оставляет их в начале.
         */

        System.out.println("abc".strip());          // abc
        System.out.println("     a b c\n".strip()); // a b c
        String text = " abc  ";                     // 6 символов
        System.out.println(text.trim().length());   // 3
        System.out.println(text.strip().length());  // 3
        System.out.println(text.stripLeading());            // "abc  ";
        System.out.println(text.stripLeading().length());   // 5
        System.out.println(text.stripTrailing());           // " abc";
        System.out.println(text.stripTrailing().length());  // 4

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

//Creating a StringBuilder
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

// Important StringBuilder Methods
        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);  // anim 7 s

// Appending Values
        var sb4 = new StringBuilder().append(1).append('c');
        sb4.append("-").append(true);
        System.out.println(sb4); // 1c-true

// Inserting Data
        var sb5 = new StringBuilder("animals");
        sb5.insert(7, "-"); // animals-
        System.out.println(sb5);
        sb5.insert(0, "-"); // -animals-
        System.out.println(sb5);
        sb5.insert(4, "-"); // -ani-mals-
        System.out.println(sb5);

// Deleting Contents
        var sb6 = new StringBuilder("abcdef");
        sb6.delete(1, 3);           // adef - удаляет с 1 по 3 не включительно
        System.out.println(sb6);
        sb6.deleteCharAt(1);  // aef
        System.out.println(sb6);
//        sb6.deleteCharAt(5);      // exception - т.к. обращаемся к несуществующему символу
        sb6.delete(1, 100);         // a - удалет с первого символа и дальше
        System.out.println(sb6);


        var builder1 = new StringBuilder("pigeon dirty");
        builder1.replace(3, 6, "sty");
        System.out.println(builder1); // pigsty dirty

        var builder2 = new StringBuilder("pigeon dirty");
        builder2.replace(3, 100, "");
        System.out.println(builder2); // pig

// Reversing
        var sb7 = new StringBuilder("ABC");
        sb7.reverse();                // CBA
        System.out.println(sb7);

// Comparing equals() and ==
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two);   // false - ссылки на объекты разные
        System.out.println(one == three); // true - ссылка одна и та же

        System.out.println("________________");

        var name3 = "a";                            // type String
        var builder3 = new StringBuilder("a");
//        System.out.println(name3 == (builder3));  // DOES NOT COMPILE
        System.out.println(name3.equals(builder3)); // false, разные типы объектов

        var name4 = new StringBuilder("a");
        var builder4 = new StringBuilder("a");
        System.out.println(name4 == builder4);      // false
        System.out.println(name4.equals(builder4)); // false

        var name5 = new String("a");
        var name6 = new String("a");
        var name7 = name6;
        System.out.println(name5 == (name6));    // false, ссылки разные
        System.out.println(name5.equals(name6)); // true, объекты одинаковые
        System.out.println(name7 == name6);      // true, ссылка на один и тот же объект
        System.out.println(name7.equals(name6)); // true, объекты одинаковые


/**
 * Метод intern() – возвращает каноническое представление для строкового объекта. Отсюда следует, что для любых
 * двух строк s и t, s.intern() == t.intern(), истинно тогда и только тогда, когда s.equals(t) имеет значение true.
 */
        System.out.println("________________");
        var x = "Hello World";
        var y = "Hello World";
        var z = new String("Hello World");

        System.out.println(x == y);      // true
        System.out.println(x.equals(y)); // true
        System.out.println(x == z);      // false   !
        System.out.println(x.equals(z)); // true

        var z1 = new String("Hello World").intern();  // !

        System.out.println(x == z1);      // true   !
        System.out.println(x.equals(z1)); // true

        var s = new String();
        s = "Hello World";

        System.out.println(x == s);      // true   !
        System.out.println(x.equals(s)); // true

        var x1 = "Hello World";
        var z2 = " Hello World".trim();
        System.out.println(x1 == z2);      // false  !
        System.out.println(x1.equals(z2)); // true

        var singleString = "hello world";
        var concat = "hello ";
        concat += "world";
        System.out.println(singleString == concat);      // false
        System.out.println(singleString.equals(concat)); // true

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);            // true
        System.out.println(first == second.intern());   // true
        System.out.println(first == third);             // false
        System.out.println(first == third.intern());    // true
    }
}
