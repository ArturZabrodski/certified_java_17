package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex5;

import java.util.Comparator;

public class SortBuYear implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getYear() < car2.getYear()) {
            return -1;
        }
        if (car1.getYear() == car2.getYear()) {   // сортируем по году
            return 0;
        }
        return 1;
    }
}
