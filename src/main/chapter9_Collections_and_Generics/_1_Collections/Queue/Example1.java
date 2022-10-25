package main.chapter9_Collections_and_Generics._1_Collections.Queue;

import java.util.ArrayDeque;

public class Example1 {
    public static void main(String[] args) {

        var greetings = new ArrayDeque<String>();
        greetings.offerLast("hello");
        greetings.offerLast("hi");
        greetings.offerFirst("ola");
        greetings.pop();
        greetings.peek();

        while (greetings.peek() != null)
            System.out.print(greetings.pop());
    }
}
