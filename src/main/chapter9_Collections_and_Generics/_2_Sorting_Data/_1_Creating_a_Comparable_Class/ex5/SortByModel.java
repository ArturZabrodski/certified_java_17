package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex5;

import java.util.Comparator;

public class SortByModel implements Comparator<Car> {
    // если вместо String будет null, то выскочит NullPointerException
    // пожтому нуно сделать проверку
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getModel().compareTo(car2.getModel());   // у String есть втроенный метод compareTo
    }
}
