package main.tests.type_operators_blocks;

public class Program1 {
    public static void main(String[] args) {
        byte b = 100;

        short s = 'A';    // в числовом выражении выведет 65
        int s1 = 'A';     // в числовом выражении выведет 65
        long s2 = 'A';    // в числовом выражении выведет 65
        byte s3 = 'A';
//      char c = "A";    // нужны одинарные кавычки, char c = 'A';

        double d1 = 1;
        var d2 = 1.1;

        float f1 = 1;
        float f2 = 1F;
        float f3 = 1.0f;
        float f4 = 0x1F;
        float f5 = 1L;
//      float f = 1.0;   // не хватает буквы а в конце float f = 1.0f;
//      float f = 1e0;   // invalid
//      float f = 1.0L;  // invalid


        Integer i1 = 1;
        int i2 = 1;

        System.out.println(i1.equals(i2));  // true
        System.out.println(i1 == i2);       // true


        int x = 1;
        int y = 2;
        int z = 4;
        x = y / z;
        System.out.println(x);
    }
}

