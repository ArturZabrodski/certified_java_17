package main.tests.collections;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List original = new ArrayList<>();
//        original.add(null);
//        List copy = List.copyOf(original); // NullPointerException


        original.add(10);
        List copy = List.copyOf(original);
        System.out.println(copy.get(0));   // 10


    }
}
