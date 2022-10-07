package main.chapter2_Operators;

public class Test2 {
    static boolean x; // false
    static boolean y; // false

    public static void main(String[] args) {
        int pig = (short) 4;
        pig = pig++; // не увеличиться
        long goat = (int) 2;
        goat -= 1.0;
        System.out.print(pig + " - " + goat);

        System.out.println();

        int ph = 7, vis = 2;
        boolean clear = vis > 1 & (vis < 9 || ph < 2);
        boolean safe = (vis > 2) && (ph++ > 1); // ph++ не вычисляется, т.к.vis>2 false
        boolean tasty = 7 <= --ph; // ph = 6
        System.out.println(clear + "-" + safe + "-" + tasty); // true-false-false

        x = x || y && !x;
        y = y && x || y;
        System.out.println(x + " " + y); // false false

        short height = 1, weight = 3;
//        short zebra = (byte) weight * (byte) height;
        int zebra = (byte) weight * (byte) height;
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        System.out.println(zebra);
        System.out.println(ox);
        System.out.println(giraffe);

        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte) (Byte.MAX_VALUE + 1);

//        int note = 1 * 2 + (long) 3; // a compilation error
        int note = 1 * 2 + 3;
        short melody = (byte) (double) (note *= 2);
        double song = melody;
        float symphony = (float) ((song == 1_000f) ? song * 2L : song);

        long ear = 10;
//        short ear = 10;
//        int hearing = 2 * (int) ear;
//        int hearing = (int) (2 * ear);
//        int hearing = 2 * ear;
        long hearing = 2 * ear;
        System.out.println(hearing);
    }
}
