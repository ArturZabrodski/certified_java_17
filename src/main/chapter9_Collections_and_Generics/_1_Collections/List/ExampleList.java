package main.chapter9_Collections_and_Generics._1_Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * List: Список - это упорядоченная коллекция элементов, которая допускает
 * дублирование записей. К элементам в списке можно получить доступ с помощью индекса int.
 * <p>
 * ArrayList подобен массиву с возможностью изменения размера. Когда элементы добавляются,
 * список объектов автоматически * увеличивается. Если вы не уверены, какую коллекцию использовать,
 * используйте ArrayList. Главное преимущество ArrayList заключается в том, что вы можете искать
 * любой элемент за постоянное время. Добавление или удаление элемента происходит медленнее,
 * чем доступ к элементу. Это делает ArrayList хорошим выбором, когда вы читаете чаще, чем
 * (или столько же, сколько) записываете в ArrayList.
 * <p>
 * LinkedList является особенным, потому что он реализует как List, так и Deque. В нем есть все методы
 * из списка. В нем также есть дополнительные методы, облегчающие добавление или удаление из начала
 * и/или конца списка. Основные преимущества LinkedList заключаются в том, что вы можете получать доступ,
 * добавлять и удалять из начала и конца списка в постоянное время. Компромисс заключается в том, что
 * работа с произвольным индексом занимает линейное время. Это делает LinkedList хорошим выбором, когда
 * вы будете использовать его в качестве Deque. Как вы видели на рисунке 9.1, LinkedList реализует как
 * интерфейсы List, так и Deque.
 */

public class ExampleList {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array);  // [a, b, c]  связан с этим массивом
        List<String> of = List.of(array);            // [a, b, c]
        List<String> copy = List.copyOf(asList);     // [a, b, c]

        array[0] = "z";

        System.out.println(asList);                 // [z, b, c]
        System.out.println(of);                     // [a, b, c]
        System.out.println(copy);                   // [a, b, c]

        asList.set(0, "x");  // поменяется элемент и в массиве
        System.out.println(Arrays.toString(array)); // [x, b, c]

//        copy.add("y"); // UnsupportedOperationException

        /**
         * Creating a List with a Constructor
         */
        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);

        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(list1);

        // В последнем примере говорится о создании ArrayList, содержащего определенное
        // количество слотов, но опять же не назначать ни одного. Вы можете думать об этом
        // как о размере базового массива.
        var list3 = new ArrayList<String>(10);


        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s : strings) {
        }


//        var list = new ArrayList<>(); // нужно указывать String как в предыдущем примере
//        list.add("a");
//        for (String s: list) { } // DOES NOT COMPILE

        /**
         * Working with List Methods
         */
        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        list.add(0, "NY"); // [NY,SD]
        list.replaceAll(x -> x.concat(" Hello"));
        list.set(1, "FL"); // [NY,FL]
        System.out.println(list.get(0)); // NY
        list.remove("NY"); // [FL]
        list.remove(0); // []
//        list.set(0, "?"); // IndexOutOfBoundsException

        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers); // [2, 4, 6]


        var list4 = new LinkedList<Integer>();
        list4.add(3);
        list4.add(2);
        list4.add(1);
        System.out.println(list4); // [3, 2, 1]
        list4.remove(2);     // [3, 2]
        list4.remove(Integer.valueOf(2)); // [3]
        System.out.println(list4);          // [3]


        /**
         * Converting from List to an Array
         */
        List<String> list5 = new ArrayList<>();
        list5.add("hawk");
        list5.add("robin");
        Object[] objectArray = list5.toArray();              // это вновь созданный массив, не имеющий отношения к исходному списку
        String[] stringArray = list5.toArray(new String[0]); // это вновь созданный массив, не имеющий отношения к исходному списку
        list5.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2
    }
}
