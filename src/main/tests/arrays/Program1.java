package main.tests.arrays;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        String concatenated = Arrays.toString(args);

        System.out.println(concatenated);
    }

    public static void main2(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.valueOf(arg);
        }
        System.out.println(sum);
    }
}

class Test {
    public static void main(String[] args) {
        String[] array = new String[]{"12", "3"};

        Program1.main(array);


        String[] array2 = new String[]{"1", "2", "3"};

        Program1.main2(array2);
    }
}
