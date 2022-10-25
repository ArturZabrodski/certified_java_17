package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Seat", 2002));
        carList.add(new Car("Audi", 2008));
        carList.add(new Car("BMW", 2010));
        carList.add(new Car("Citroen", 2007));
        carList.add(new Car("Volvo", 2015));


        // сортируем по году, создает отдельный класс
        Collections.sort(carList, new SortBuYear());  // в функцию sort подаем list и объект в котором реализована сортировка

        for (Car car : carList) {
            System.out.println(car.getModel() + " | " + car.getYear());
        }

        System.out.println();


        // 2 вариант, создаем объект Comparator и переопределяем метод
        Comparator<Car> sortByModel = new Comparator<Car>() {
            // если вместо String будет null, то выскочит NullPointerException
            // пожтому нуно сделать проверку
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());   // у String есть втроенный метод compareTo
            }
        };

        // сортируем по моделям
        Collections.sort(carList, sortByModel);

        for (Car car : carList) {
            System.out.println(car.getModel() + " | " + car.getYear());
        }
    }
}