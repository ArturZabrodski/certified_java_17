package main.chapter9_Collections_and_Generics._1_Using_Common_Collection_APIs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * List: Список - это упорядоченная коллекция элементов, которая допускает
 * дублирование записей. К элементам в списке можно получить доступ с помощью индекса int.
 * <p>
 * Set: Set - это коллекция, которая не допускает дублирования записей.
 * <p>
 * Queue: Очередь - это коллекция, которая упорядочивает свои элементы в
 * определенном порядке для обработки.
 * Deque - это подинтерфейс очереди, который обеспечивает доступ с обоих концов.
 * <p>
 * Map: Map - это коллекция, которая сопоставляет ключи со значениями, при этом дубликаты
 * ключей не допускаются. Элементы на карте представляют собой пары ключ/значение.
 */

public class Example1 {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false

        System.out.println("________");

        // add, remove
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds); // [hawk]
        birds.remove("hawk");
        System.out.println(birds); // []

        System.out.println("________");

        // isEmpty(), size()
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2

        System.out.println("________");

        //clear
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
        birds.clear(); // []
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0

        System.out.println("________");

        // Метод contains() проверяет, есть ли определенное значение в коллекции.
        birds.add("hawk"); // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false

        System.out.println("________");

        // removeIf() удаляет все элементы, соответствующие условию.
        // startsWith() - проверяет начинается ли элемент на проверяемую строку или символ
        // public boolean removeIf(Predicate<? super E> filter)
        Collection<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        // через лямбда-выражение удаляем все строковые значения, начинающиеся с буквы A.
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]


        // set(), get() - присутствуют, только в List,
        // startsWith() - проверяет начинается ли элемент на проверяемую строку или символ
        List<String> list1 = new ArrayList<>();
        list1.add("Magician");
        list1.add("Assistant");
        System.out.println(list1); // [Magician, Assistant]
        list1.add(1, "Robin"); // добавляет элемент под индексом 1, не удаляя существующий
        System.out.println(list1); // [Magician, Robin, Assistant]
        list1.set(1, "Cardinal"); // заменяет элемент под индексом 1
//      list1.set(3, "Cardinal"); // IndexOutOfBoundsException, т.к. в list1 только 0 1 2 индексы
//      list1.add(4, "Robin"); // IndexOutOfBoundsException, т.к. добавлять нужно по порядку т.е. индекс 3
        System.out.println(list1);

        System.out.println(list1.get(2) + " " + list1.get(2).startsWith("A"));  // Assistant true
        System.out.println(list1.get(1) + " " + list1.get(1).startsWith("A"));  // Cardinal false
    }
}
