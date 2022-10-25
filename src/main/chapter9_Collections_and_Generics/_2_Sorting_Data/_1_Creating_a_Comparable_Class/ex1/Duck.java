package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex1;

import java.util.*;

public class Duck implements Comparable<Duck> {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String toString() { // use readable output
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // sorts ascendingly by name
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
//        ducks.sort(Duck::compareTo); // sort by name
        System.out.println(ducks); // [Puddles, Quack]
    }
}