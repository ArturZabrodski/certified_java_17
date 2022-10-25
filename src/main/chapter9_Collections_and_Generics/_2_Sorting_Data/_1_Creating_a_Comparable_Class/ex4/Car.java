package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex4;

import org.jetbrains.annotations.NotNull;

public class Car implements Comparable<Car> { // обязательно добавляем <Car>
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    @Override
//    public int compareTo(Car car) {    // преобразуем метод
//        if (year == car.getYear()) {   // сортируем по году
//            return 0;
//        }
//        if (year < car.getYear()) {
//            return -1;
////            return 1;  // сортируем по году в обратном порядке
//        }
//        return 1;
////        return -1;     // сортируем по году в обратном порядке
//    }

    @Override
    public int compareTo(Car car) {
        return model.compareTo(car.getModel());   // у String есть втроенный метод compareTo
    }

}
