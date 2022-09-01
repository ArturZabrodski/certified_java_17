package main.test0_1;

import java.util.*;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("   1:");

        // 1. What is the result of executing the following code snippet?
        // A. unknown
        // B. great
        // C. good
        // D. bad
        // E. unknowngreatgoodbad
        // F. Exactly one line needs to be changed for the code to compile.
        // +G. Exactly two lines need to be changed for the code to compile.
        // H. None of the above

        final int score1 = 8, score2 = 3;
        char myScore = 7;
        var goal = switch (myScore) {
//            default -> {
//                if (10 > score1) yield "unknown";
//            }
            default -> {
                yield "unknown";
            }
            case score1 -> "great";
            case 2, 4, 6 -> "good";
//            case score2, 0 -> {bad";}
            case score2, 0 -> "bad";
        };
        System.out.println(goal);

        System.out.println("   2:");

        // 2. What is the output of the following code snippet?
        // A. 1, 11, 2
        // +B. 3.0, 11.0, 2
        // C. 1.0, 11.0, 3
        // D. 3.0, 13.0, 3
        // E. 3.0f, 12, 2
        // F. The code does not compile because one of the assignments requires an explicit numeric cast.

        int moon = 9, star = 2 + 2 * 3;
        float sun = star > 10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.println(sun + ", " + jupiter + ", " + mars);

        System.out.println("   3:");

        // 3. Which changes, when made independently, guarantee the following code snippet prints 100 at
        //runtime? (Choose all that apply.)
//        A. Change data to an instance variable and mark it volatile.
//        +B. Remove parallel() in the stream operation.
//        +C. Change forEach() to forEachOrdered() in the stream operation.
//        D. Change parallel() to serial() in the stream operation.
//        E. Wrap the lambda body with a synchronized block.
//        F. The code snippet will always print 100 as is.
        List<Integer> data = new ArrayList<>();
        IntStream.range(0, 100).parallel().forEach(s -> data.add(s));
        System.out.println(data.size());

        System.out.println("   4:");

        // 4. What is the output of this code?
//        A. It outputs {}.
//        B. It outputs {false=[], true=[]}.
//        C. The code does not compile.
//        D. The code does not terminate.

//        Predicate<String> empty = String::isEmpty;
//        Predicate<String> notEmpty = empty.negate();
//
//        var result = Stream.generate(() -> "")
//                .filter(notEmpty)
//                .collect(Collectors.groupingBy(k -> k))
//                .entrySet()
//                .stream()
//                .map(Map.Entry::getValue)
//                .flatMap(Collection::stream)
//                .collect(Collectors.partitioningBy(notEmpty));
//        System.out.println(result);


//        5. What is the result of the following program?
//        A. 10
//        +B. 15
//        C. 25
//        D. Compiler error on line 3
//        E. Compiler error on line 8
//        F. None of the above

        class MathFunctions {
            public static void addToInt(int x, int amountToAdd) {
                x = x + amountToAdd;
            }

            public static void main(String[] args) {
                var a = 15;
                var b = 10;
                addToInt(a, b);
                System.out.println(a);
            }
        }


//        6. Suppose that we have the following property files and code. What values are printed on lines
//        8 and 9, respectively?

//        Penguin.properties
//                name=Billy
//                age=1
//        Penguin_de.properties
//                name=Chilly
//                age=4
//        Penguin_en.properties
//                name=Willy

//        A. Billy and 1
//        B. Billy and null
//        C. Willy and 1
//        D. Willy and null
//        E. Chilly and null
//        +F. The code does not compile.

        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
//        var b = ResourceBundle.getBundle("Penguin", fr);
//        System.out.println(b.getString("name"));
//        System.out.println(b.getString("age"));

        System.out.println("   7:");

//        7. What is guaranteed to be printed by the following code? (Choose all that apply.)
//        +A. B1
//        B. B2
//        C. C-1
//        +D. C0
//        +E. M-1
//        F. M0
//        G. The code does not compile.

        int[] array = {6, 9, 8};

        // выполняет поиск жжлемента и выводит индекс
        System.out.println("B" + Arrays.binarySearch(array, 9));
        // сравнивает массивы поэлементно, если один из элементво больше, то
        // то выведет 1, а также если элементы равны, но в одном на 1 элемент больше.
        // Если меньше то -1, если равны то 0.
        System.out.println("C" + Arrays.compare(array, new int[]{6, 9, 8}));
        // возвращает индекс первого несоответствия, иначе -1
        System.out.println("M" + Arrays.mismatch(array, new int[]{6, 9, 8}));

        System.out.println("   8:");

        // 8. Which functional interfaces complete the following code, presuming variable r exists?
        //(Choose all that apply.)
//        x = r.negate();
//        y = () -> System.out.println();
//        z = (a, b) -> a - b;

//        A. BinaryPredicate<Integer, Integer>
//        B. Comparable<Integer>
//        C. Comparator<Integer>
//        D. Consumer<Integer>
//        E. Predicate<Integer>
//        F. Runnable
//        G. Runnable<Integer>

//        x = r.negate();
//        y = () -> System.out.println();
//        z = (a, b) -> a - b;


        // 9. Suppose you have a module named com.vet. Where could you place the following
        // module-info.java file to create a valid module?
//        A. At the same level as the com folder
//        B. At the same level as the vet folder
//        C. Inside the vet folder
//        D. None of the above

//        public module com.vet {
//            exports com.vet;
//        }


//        10. What is the output of the following program? (Choose all that apply.)
//        A. 2
//        B. 4
//        +C. The code will not compile because of line 1.
//        D. The code will not compile because of line 3.
//        E. The code will not compile because of line 5.
//        F. The code will not compile because of line 7.
//        G. The code will not compile because of line 10.
//        H. The output cannot be determined from the code provided.

//        1: interface HasTail { private int getTailLength(); }
//        2: abstract class Puma implements HasTail {
//        3: String getTailLength() { return "4"; }
//        4: }
//        5: public class Cougar implements HasTail {
//        6: public static void main(String[] args) {
//        7: var puma = new Puma() {};
//        8: System.out.println(puma.getTailLength());
//        9: }
//        10: public int getTailLength(int length) { return 2; }
//        11: }


//        11. Which lines in Tadpole.java give a compiler error ? (Choose all that apply.)
//        A.Line 5
//        B.Line 6
//        +C.Line 7
//        D.Line 8
//        +E.Line 9
//        +F.Line 10
//        G.All of the lines compile.

        // Frog.java
        // Tadpole.java


//        12. Which of the following can fill in the blanks in order to make this code compile?
//        A. Connection, Driver, PreparedStatement, ResultSet
//        B. Connection, DriverManager, PreparedStatement, ResultSet
//        C. Connection, DataSource, PreparedStatement, ResultSet
//        D. Driver, Connection, PreparedStatement, ResultSet
//        E. DriverManager, Connection, PreparedStatement, ResultSet
//        F. DataSource, Connection, PreparedStatement, ResultSet

//        _____a = _____.getConnection(url, userName, password);
//        _____b = a.prepareStatement(sql);
//        _____c = b.executeQuery();
//        if (c.next()) System.out.println(c.getString(1));


//        13. Which of the following statements can fill in the blank to make the code compile success-fully?
//        (Choose all that apply.)
//        A. HashSet<? extends RuntimeException>
//        B. HashSet<Exception>
//        +C. TreeSet<RuntimeException>
//        +D. TreeSet<NullPointerException>
//        E. None of the above

        Set<? extends RuntimeException> mySet = new TreeSet<NullPointerException>();



//        14. Assume that birds.dat exists, is accessible, and contains data for a Bird object. What is
//        the result of executing the following code? (Choose all that apply.)

//        A. It compiles and prints 0 at runtime.
//        B. It compiles and prints null at runtime.
//        C. It compiles and prints a number at runtime.
//        D. The code will not compile because of lines 9–11.
//        E. The code will not compile because of line 12.
//        F. It compiles but throws an exception at runtime.

//        import java.io.*;
//         public class Bird {
// private String name;
// private transient Integer age;
//
//         // Getters/setters omitted
//
//         public static void main(String[] args) {
//                 try(var is = new ObjectInputStream(
//                         new BufferedInputStream(
//                                new FileInputStream("birds.dat")))) {
//                     Bird b = is.readObject();
//                     System.out.println(b.age);
//                     } } }


//        15. Which of the following are valid instance members of a class? (Choose all that apply.)
//        +A. var var = 3;
//        B. Var case = new Var();
//        +C. void var() {}
//        D. int Var() { var _ = 7; return _;}
//        E. String new = "var";
//        +F. var var() { return null; }



//        16. Which is true if the table is empty before this code is run? (Choose all that apply.)
//        A. If the blank line contains rollback(), there are no rows in the table.
//        B. If the blank line contains rollback(), there is one row in the table.
//        C. If the blank line contains rollback(sp), there are no rows in the table.
//        D. If the blank line contains rollback(sp), there is one row in the table.
//        E. The code does not compile.
//        F. The code throws an exception because the second update does not set all the parameters.


//        var sql = "INSERT INTO people VALUES(?, ?, ?)";
//        conn.setAutoCommit(false);
//        try (var ps = conn.prepareStatement(sql,
//                ResultSet.TYPE_SCROLL_SENSITIVE,
//                ResultSet.CONCUR_UPDATABLE)) {
//            ps.setInt(1, 1);
//            ps.setString(2, "Joslyn");
//            ps.setString(3, "NY");
//            ps.executeUpdate();
//            Savepoint sp = conn.setSavepoint();
//            ps.setInt(1, 2);
//            ps.setString(2, "Kara");
//            ps.executeUpdate();
//            conn. ;
//        }






        System.out.println("   :");
    }
}
