package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex3;

@FunctionalInterface
public interface Comparable<T> {
    int compareTo(T o);
}