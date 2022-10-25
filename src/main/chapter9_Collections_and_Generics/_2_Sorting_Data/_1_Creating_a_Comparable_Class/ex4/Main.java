package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Seat", 2002));
        carList.add(new Car("Audi", 2008));
        carList.add(new Car("BMW", 2010));
        carList.add(new Car("Citroen", 2007));
        carList.add(new Car("Volvo", 2015));

        Collections.sort(carList);  // через Comparable не очень удобно сортировать когда нужно сделать много сортировок

        for (Car car : carList) {
            System.out.println(car.getModel() + " | " + car.getYear());
        }
    }
}
