package main.chapter5_Methods;

public class Counter {
    private static int count;
    private static final String[] treats = new String[10];  // нельзя менять только ссылку
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3

        treats[0] = "popcorn";
        System.out.println(treats[0]);
        treats[0] = "bread";
        System.out.println(treats[0]);
        treats[1] = "butter";
        System.out.println(treats[1]);

        System.out.println(NUM_SECONDS_PER_HOUR);
    }
}