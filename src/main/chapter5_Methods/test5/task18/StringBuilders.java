package main.chapter5_Methods.test5.task18;

public class StringBuilders {
    public static StringBuilder work(StringBuilder a,
                                     StringBuilder b) {
        a = new StringBuilder("a");       //
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
        var s1 = new StringBuilder("s1");
        var s2 = new StringBuilder("s2");
        var s3 = work(s1, s2); // s1 не поменяется, к s2 добавиться b, s3 = a
        System.out.println("s1 = " + s1);  // s1 = s1
        System.out.println("s2 = " + s2);  // s2 = s2b
        System.out.println("s3 = " + s3);  // s3 = a
    }
}