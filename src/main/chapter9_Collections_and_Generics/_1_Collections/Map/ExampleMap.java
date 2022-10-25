package main.chapter9_Collections_and_Generics._1_Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map - это коллекция, которая сопоставляет ключи со значениями, при этом дубликаты
 * ключей не допускаются. Элементы на карте представляют собой пары ключ/значение.
 */

public class ExampleMap {
    public static void main(String[] args) {

        // Map.copyOf(map) работает так же, как и методы List и Set interface copyOf().

        Map.of("key1", "value1", "key2", "value2");

        Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2"));

        // Working with Map Methods

/**
        public void clear()                               // Удаляет все ключи и значения с карты.

        public boolean containsKey(Object key)            // Возвращает, находится ли ключ на карте.

        public boolean containsValue(Object value)        // Возвращает, находится ли значение на карте.

        public Set<Map.Entry<K,V>> entrySet()             // Возвращает набор пар ключ/значение.

        public void forEach(BiConsumer<K key, V value>)   // перебирает каждую пару ключ/значение.

        public V get(Object key)                          // Возвращает значение, сопоставленное по ключу, или null,
                                                          // если ни одно из них не сопоставлено.

        public V getOrDefault(Object key, V defaultValue)  // Возвращает значение, сопоставленное по ключу, или
                                                           // значение по умолчанию, если ни одно из них не сопоставлено.

        public boolean isEmpty()                           // Возвращает, является ли карта пустой.

        public Set<K> keySet()                             // Возвращает набор всех ключей

        public V merge(K key, V value, Function(<V, V, V> func))  // Устанавливает значение, если ключ не установлен.
                                                                  // Запускает функцию, если установлен ключ, для определения
                                                                  // нового значения. Удаляет, если значение равно null.

        public V put(K key, V value)                 // Добавляет или заменяет пару ключ/значение.
                                                     // Возвращает предыдущее значение или null.

        public V putIfAbsent(K key, V value)         // Добавляет значение, если ключ отсутствует, и возвращает null.
                                                     // В противном случае возвращается существующее значение.

        public V remove(Object key)                  // Удаляет и возвращает значение, сопоставленное ключу.
                                                     // Возвращает значение null, если его нет.

        public V replace(K key, V value)             // Заменяет значение для данного ключа, если ключ установлен.
                                                     // Возвращает исходное значение или null, если его нет.

        public void replaceAll(BiFunction<K, V, V> func) // Заменяет каждое значение результатами функции.

        public int size()                            // Возвращает количество записей (пар ключ/значение) на карте.

        public Collection<V> values()                // Возвращает коллекцию всех значений
 */


        // Calling Basic Methods
        // HashMap - добавляет в неопределенном порядке
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("koala", "bamboo");
        hashMap.put("lion", "meat");
        hashMap.put("giraffe", "leaf");
        String food1 = hashMap.get("koala"); // bamboo
        for (String key: hashMap.keySet())
            System.out.print(key + ", ");    // выводим ключи - koala, giraffe, lion,

        System.out.println();

        for (String value: hashMap.values())
            System.out.print(value + ",");   // выводим значения - bamboo,leaf,meat,

        System.out.println();

        System.out.println(hashMap.get("koala").hashCode());    // -1396384012
        System.out.println(hashMap.get("lion").hashCode());     // 3347403
        System.out.println(hashMap.get("giraffe").hashCode());  // 3317598


        // TreeMap - сортирует по ключу
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("koala", "bamboo");
        treeMap.put("lion", "meat");
        treeMap.put("giraffe", "leaf");
        String food2 = treeMap.get("koala"); // bamboo
        for (String key: treeMap.keySet())
            System.out.print(key + ",");     // выводим ключи - giraffe,koala,lion,

        System.out.println();

        for (String value: treeMap.values())
            System.out.print(value + ",");   // выводим значения - leaf,bamboo,meat,

        System.out.println();

//        System.out.println(treeMap.contains("lion")); // DOES NOT COMPILE
        System.out.println(treeMap.containsKey("lion")); // true
        System.out.println(treeMap.containsValue("lion")); // false
        System.out.println(treeMap.size()); // 3
        treeMap.clear();
        System.out.println(treeMap.size()); // 0
        System.out.println(treeMap.isEmpty()); // true

        System.out.println();

        // Iterating through a Map
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');

        map.forEach((k, v) -> System.out.println(v));
//        map.values().forEach(System.out::println); // аналогичный код

        map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        char value = map.get(2); // в переменной будет храниться значение по ключу, т.е. 'b'
        System.out.println(value);

        System.out.println(map.get(1).hashCode());  // 97 hashCode - уникальное int-значение
        System.out.println(map.get(2).hashCode());  // 98
        System.out.println(map.get(3).hashCode());  // 99



    }
}
