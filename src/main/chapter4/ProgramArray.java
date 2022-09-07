package main.chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProgramArray {
    public static void main(String[] args) {
//        public static void main(String[] args) {
//        public static void main(String args[]) {
//        public static void main(String... args) { // varargs

//        int[] numbers = new int[3];
//        int[] moreNumbers = {42, 55, 99};
//        int[] numAnimals;
//        int [] numAnimals2;
//        int []numAnimals3;
//        int numAnimals4[];
//        int numAnimals5 [];

//        int[] ids, types; // создает два массива int[]
//        int ids[], types; // создает массив int (переменную int[]) и переменную int

// Creating an Array with Reference Variables
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));     // true
        System.out.println(bugs.toString());        // ссылка Ljava.lang.String;@3fee733d
        System.out.println(Arrays.toString(bugs));  // [cricket, beetle, ladybug]
        System.out.println(Arrays.toString(alias)); // [cricket, beetle, ladybug]

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//        objects[0] = new StringBuilder();        // Careful!
        objects[0] = "text";
        System.out.println(Arrays.toString(objects));      // [text]
        System.out.println(Arrays.toString(againStrings)); // [text]


        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
//        System.out.println(mammals.length()); // DOES NOT COM
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey


        var numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;

        // Exception
//        numbers[10] = 3;
//        numbers[numbers.length] = 5;

//        for (int i = 0; i <= numbers.length; i++)
//            numbers[i] = i + 5;

// Sort
        int[] numbers1 = {6, 9, 1};
        Arrays.sort(numbers1);
        for (int i = 0; i < numbers1.length; i++)
            System.out.print(numbers1[i] + " ");

        System.out.println();

        String[] strings1 = {"10", "9", "100"};
        Arrays.sort(strings1);
        for (String s : strings1)
            System.out.print(s + " ");      // 10 100 9, т.к. строка сортируется в алфавитном порядке, а 1 сортируется перед 9

        System.out.println();

// Searching
        int[] numbers2 = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers2, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers2, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers2, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers2, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers2, 9)); // -5


        // работает неправильно, т.к. не отсортирован
        int[] numbers3 = new int[]{3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers3, 2)); // 1
        System.out.println(Arrays.binarySearch(numbers3, 3)); // -4

// Comparing

        /**
         * ■ Отрицательное число означает, что первый массив меньше второго.
         * ■ Ноль означает, что массивы равны.
         * ■ Положительное число означает, что первый массив
         *
         * ■ Если оба массива имеют одинаковую длину и имеют одинаковые значения в каждом месте в одинаковом
         * порядке, верните ноль.
         * ■ Если все элементы одинаковы, но во втором массиве есть дополнительные элементы в конце,
         * верните отрицательное число.
         * ■ Если все элементы одинаковы, но в конце первого массива есть дополнительные элементы, верните
         * положительное число.
         * ■ Если первый отличающийся элемент меньше в первом массиве, верните отрицательное число.
         * ■ Если первый отличающийся элемент больше в первом массиве, верните положительное число.
         *
         * Наконец, что означает "меньше"? Вот еще несколько правил, применимых здесь и к
         * compareTo(), которые вы видите в главе 8 “Лямбды и функциональные интерфейсы”.:
         * ■ значение null меньше любого другого значения.
         * ■ Для чисел применяется обычный числовой порядок.
         * ■ Для строк единица меньше, если она является префиксом другой.
         * ■ Для строк/символов цифры меньше букв.
         * ■ Для строк/символов верхний регистр меньше нижнего.
         */

//        System.out.println(Arrays.compare(new int[]{1}, new String[]{"a"})); // DOES NOT COMPILE, т.к. разные типы данных

        System.out.println(Arrays.compare(new int[]{1}, new int[]{2})); // -1
        System.out.println(Arrays.compare(new int[]{1}, new int[]{1})); // 0
        System.out.println(Arrays.compare(new int[]{2}, new int[]{1})); // 1

        /**
         * mismatch().
         * Если массивы равны, функция mismatch() возвращает значение -1.
         * В противном случае он возвращает первый индекс, в котором они отличаются.
         */

        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));            // -1
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"}));  // 0
        System.out.println(Arrays.mismatch(new String[]{"A"}, new String[]{"a"}));  // 0
        System.out.println(Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 2}));   // 2


// Multidimensional Arrays
        int[][] vars1;              // 2D array
        int vars2[][];             // 2D array
        int[] vars3[];              // 2D array
        int[] vars4[], space[][]; // a 2D AND a 3D array

        String[][] rectangle = new String[3][2];

// Asymmetric multidimensional array
        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};

        int[][] args1 = new int[4][];
        args1[0] = new int[5];
        args1[1] = new int[3];

// Using a Multidimensional Array
        var twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }


        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
