package main.chapter9_Collections_and_Generics._1_Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set - это коллекция, которая не допускает дублирования записей.
 * <p>
 * HashSet - хранит свои элементы в хэш-таблице, что означает, что ключи являются хэшем,
 * а значения - объектом. Это означает, что HashSet использует метод hashCode() объектов
 * для их более эффективного извлечения. Помните, что допустимый hashCode() не означает,
 * что каждый объект получит уникальное значение, но метод часто пишется так, что хэш-значения
 * распределяются по большому диапазону, чтобы уменьшить коллизии.
 * Основное преимущество заключается в том, что добавление элементов и проверка того, есть ли
 * элемент в наборе, имеют постоянное время. Компромисс заключается в том, что вы теряете порядок,
 * в котором вы вставили элементы. В большинстве случаев вас все равно не волнует это в наборе,
 * что делает HashSet наиболее распространенным набором.
 * <p>
 * TreeSet - хранит свои элементы в отсортированной древовидной структуре. Главное преимущество
 * заключается в том, что набор всегда находится в отсортированном порядке. Компромисс заключается
 * в том, что добавление и проверка наличия элемента занимает больше времени, чем при использовании
 * HashSet, особенно по мере увеличения дерева.
 */

public class ExampleSet {
    public static void main(String[] args) {
        /**
         * Working with Set Methods
         */
//        Set<Character> letters = Set.of('z', 'o', 'o');
//        Set<Character> copy = Set.copyOf(letters);

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        boolean b1 = hashSet.add(66); // true
        boolean b2 = hashSet.add(10); // true
        boolean b3 = hashSet.add(66); // false
        boolean b4 = hashSet.add(8);  // true
        hashSet.forEach(System.out::println);

        System.out.println();

        // ThreeSet
        Set<Integer> treeSet = new TreeSet<>();
        boolean b11 = treeSet.add(66); // true
        boolean b21 = treeSet.add(10); // true
        boolean b31 = treeSet.add(66); // false
        boolean b41 = treeSet.add(8);  // true
        treeSet.forEach(System.out::println);
    }
}
